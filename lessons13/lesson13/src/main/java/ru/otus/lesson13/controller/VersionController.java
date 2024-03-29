package ru.otus.lesson13.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${lesson13.version}")
    private String version;

    @GetMapping(value = "/version")
    String getAppVersion() {
        return version;
    }
}