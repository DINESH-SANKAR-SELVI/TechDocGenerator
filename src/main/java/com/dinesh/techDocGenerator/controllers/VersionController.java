package com.dinesh.techDocGenerator.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("versionManagement")
public class VersionController {

    @GetMapping("currentVersion")
    public ResponseEntity<?> projectCurrentVersion() {
        try {
            StringBuilder version = new StringBuilder("25-05-2024-Build-01[V1.0.0]");
            return new ResponseEntity<>("<h1 style='margin: 50 auto;'>" + version + "</h1>", HttpStatus.FOUND);
        } catch (Exception error) {
            return new ResponseEntity<>("Kindly Contact Admin" + error.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
