package com.example.spock;

import org.springframework.stereotype.Component;

@Component
public class ExternalApiClient {
    public String bar() {
        return "bar";
    }
}
