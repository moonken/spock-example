package com.example.spock;

import org.springframework.stereotype.Service;

@Service
public class FooService {

    private final ExternalApiClient client;

    public FooService(ExternalApiClient client) {
        this.client = client;
    }

    public String foo() {
        return "foo";
    }

    public String bar() {
        return client.bar();
    }
}
