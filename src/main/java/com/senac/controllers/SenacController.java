package com.senac.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SenacController
 *
 * @author alysson
 *
 */
@RestController
@RequestMapping("/senac/exemplo")
public class SenacController {

    @GetMapping("/teste")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("TESTE!");
    }

}