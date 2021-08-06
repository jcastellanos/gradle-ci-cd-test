package com.jcastellanos.test.controller;

import com.jcastellanos.test.service.PingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/ping")
@RestController
public class PingController {
    private final PingService pingService;

    @GetMapping
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>(pingService.ping(), HttpStatus.OK);
    }
}
