package com.jcastellanos.test.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PingServiceTests {
    @Test
    @DisplayName("Operacion ping")
    public void ping() {
        PingService service = new PingService();
        assertEquals("pong", service.ping());
    }
}
