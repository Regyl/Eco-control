package com.leadersofdigital.ecocontrol.api.controller;

import com.leadersofdigital.ecocontrol.entity.AccessedPolluter;
import com.leadersofdigital.ecocontrol.parser.CustomParser;
import com.leadersofdigital.ecocontrol.service.AccessedPolluterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Internal resource parser")

@RestController
@RequestMapping("/parser")
public class ParseController {
    private final CustomParser customParser;
    private final AccessedPolluterService service;

    public ParseController(CustomParser customParser, AccessedPolluterService service) {
        this.customParser = customParser;
        this.service = service;
    }

    @GetMapping("/all")
    @Operation(summary = "Parse all documents")
    public void parseAll() {
        customParser.parseAll();
    }

    @GetMapping("/")
    public List<AccessedPolluter> findAll(@RequestParam("start") int start,
                                          @RequestParam("size") int size) {
        return service.findAll(PageRequest.of(start, size));
    }
}
