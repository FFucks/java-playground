package com.ffucks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ClientController {

    RestTemplate restTemplate;

    @GetMapping("/client")
    public Map<String, Object> getClient() {

        restTemplate.exchange();

        return Map.of("page", "client", "status", "ok");
    }
}
