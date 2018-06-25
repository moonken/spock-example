package com.example.spock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @Autowired
    FooService fooService;

    @GetMapping
    public String get() {
        return "hello world";
    }

    @GetMapping("foo")
    public String foo() {
        return fooService.foo();
    }
}
