package org.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> getServerHello() {
        try {
            String response = "Hello, world!";
            log.info("response={}", response);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            String errorMessage = String.format("An error occurred whilst running app: %s", e.getMessage());
            log.error(errorMessage, e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage);
        }
    }
}
