package com.jcastellanos.test.service;

import org.springframework.stereotype.Service;

@Service
public class PingService {
    public String ping() {
        return "pong";
    }
}
