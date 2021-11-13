package com.leadersofdigital.ecocontrol.parser;

import com.leadersofdigital.ecocontrol.entity.Okved;
import com.leadersofdigital.ecocontrol.entity.Organization;
import com.leadersofdigital.ecocontrol.repository.OkvedRepository;
import com.leadersofdigital.ecocontrol.service.OrganizationService;
import lombok.extern.java.Log;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log
@Component
public class CustomParser {
    private static final String FIRST_LICENSE_FILE = "src/main/resources/data/20.10.2021 Реестр лицензий на заготовку, хранение, переработку и реализацию лома черных металлов, цветных металлов.xlsx";
    private static final String SECOND_LICENSE_FILE = "src/main/resources/data/Реестр лицензий на обращение с отходами 1.xls";
    private static final String THIRD_LICENSE_FILE = "src/main/resources/data/Реестр лицензий на обращение с отходами 2.xls";
    private static final String FOUR_LICENSE_FILE = "src/main/resources/data/Реестр разрешений на выбросы загрязняющих веществ -Минэкология.xlsx";
    private static final String PTO_NVOS = "src/main/resources/data/Реестр ПТО НВОС.xlsx";

    private final OrganizationService organizationService;
    private final OkvedRepository okvedRepository;

    public CustomParser(OrganizationService organizationService, OkvedRepository okvedRepository) {
        this.organizationService = organizationService;
        this.okvedRepository = okvedRepository;
    }

    public void parsePto() {
        try (Workbook wb = WorkbookFactory.create(new FileInputStream(PTO_NVOS))) {
            Sheet sheet = wb.getSheetAt(0);
            List<Okved> okvedList = new ArrayList<>();
            for (Row row : sheet) {
                if (row.getRowNum() < 1) {
                    continue;
                }
                Okved okved = new Okved();
                okved.setValue(validateOkved(row.getCell(4).getStringCellValue()));
                okved.setNvos(Integer.parseInt(String.valueOf(row.getCell(5).getNumericCellValue())));

                okvedList.add(okved);
            }
            okvedRepository.saveAll(okvedList);
        } catch (IOException e) {
            log.warning(e.getMessage());
        }
    }

    private static String validateOkved(String okved) {

        return okved;
    }

    public void parseAll() {
        parse(FIRST_LICENSE_FILE, 6, 7, 13, 3);
        parse(SECOND_LICENSE_FILE, 2, 6, 18, 2);
        parse(THIRD_LICENSE_FILE, 2, 6, 18, 2);
        parse(FOUR_LICENSE_FILE, 1, 3, 2, 5);
    }

    private static Cell getCell(Row row, int column) {
        return row.getCell(column, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
    }

    //validator for address
    private static String validateAddress(String address) {
        if(address.length() < 10 || StringUtils.isNumeric(address.substring(0, 3))) {
            return null;
        }
        return address.replace("\n", "");
    }

    //validator for inn
    private static String validateInn(String inn) {
        if(inn.indexOf('\n') != -1) {
            return inn.substring(0, inn.indexOf('\n'));
        }
        return inn;
    }

    private void parse(String filename, int nameColumn, int innColumn, int addressColumn, int rowSkip) {
        try (Workbook wb = WorkbookFactory.create(new FileInputStream(filename))) {
            Sheet sheet = wb.getSheetAt(0);
            List<Organization> licenseList = new ArrayList<>();
            for (Row row : sheet) {
                if (row.getRowNum() < rowSkip) {
                    continue;
                }
                Organization license = new Organization();

                license.setName(getCell(row, nameColumn).getStringCellValue());
                if (!licenseList.isEmpty() && license.getName().equals(licenseList.get(licenseList.size() - 1).getName())) {
                    continue;
                }

                Cell innCell = getCell(row, innColumn);
                if (innCell.getCellType().equals(CellType.NUMERIC)) {
                    license.setInn(Long.valueOf(
                            validateInn(String.valueOf(Math.round(innCell.getNumericCellValue())))));
                } else {
                    license.setInn(Long.valueOf(
                            validateInn(innCell.getStringCellValue())));
                }

                license.setAddress(
                        validateAddress(getCell(row, addressColumn).getStringCellValue()));

                if(!StringUtils.isNotBlank(license.getAddress())) {
                    continue;
                }

                licenseList.add(license);
            }
            organizationService.saveAll(licenseList);
        } catch (IOException e) {
            log.warning(e.getMessage());
        }
    }

}
