package com.leadersofdigital.ecocontrol.parser;

import com.leadersofdigital.ecocontrol.entity.AccessedPolluter;
import com.leadersofdigital.ecocontrol.repository.AccessedPolluterRepository;
import com.leadersofdigital.ecocontrol.service.AccessedPolluterService;
import lombok.extern.java.Log;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Log
@Component
public class CustomParser {
    private static final String FIRST_LICENSE_FILE = "src/main/resources/data/20.10.2021 Реестр лицензий на заготовку, хранение, переработку и реализацию лома черных металлов, цветных металлов.xlsx";
    private static final String SECOND_LICENSE_FILE = "src/main/resources/data/Реестр лицензий на обращение с отходами 1.xls";
    private static final String THIRD_LICENSE_FILE = "src/main/resources/data/Реестр лицензий на обращение с отходами 2.xls";
    private static final String FOUR_LICENSE_FILE = "src/main/resources/data/Реестр разрешений на выбросы загрязняющих веществ -Минэкология.xlsx";

    private final AccessedPolluterService service;

    public CustomParser(AccessedPolluterService service) {
        this.service = service;
    }

    public void parseAll() {
        parse(FIRST_LICENSE_FILE, 6, 7, 13, 3);
        parse(SECOND_LICENSE_FILE, 2, 6, 18, 2);
        parse(THIRD_LICENSE_FILE, 2, 6, 18, 2);
        parse(FOUR_LICENSE_FILE, 1, 3, 2, 5);
    }

    private void parse(String filename, int nameColumn, int innColumn, int addressColumn, int rowSkip) {
        try (Workbook wb = WorkbookFactory.create(new FileInputStream(filename))) {
            Sheet sheet = wb.getSheetAt(0);
            List<AccessedPolluter> licenseList = new ArrayList<>();
            for (Row row : sheet) {
                if (row.getRowNum() < rowSkip) {
                    continue;
                }

                AccessedPolluter license = new AccessedPolluter();
                license.setName(row.getCell(nameColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
                if (!licenseList.isEmpty() && license.getName().equals(licenseList.get(licenseList.size() - 1).getName())) {
                    continue;
                }
                if (row.getCell(innColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getCellType().equals(CellType.NUMERIC)) {
                    license.setInn(String.valueOf(Math.round(row.getCell(innColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue())));
                } else {
                    license.setInn(row.getCell(innColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
                }
                license.setAddress(row.getCell(addressColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());

                licenseList.add(license);
            }
            service.saveAll(licenseList);
        } catch (IOException e) {
            log.warning(e.getMessage());
        }
    }

}
