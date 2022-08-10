package com.github.actions.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping
    public ResponseEntity<String> getMainEndpoint() {
        return ResponseEntity.status(HttpStatus.OK).body("NOT OK YET");
    }

}
