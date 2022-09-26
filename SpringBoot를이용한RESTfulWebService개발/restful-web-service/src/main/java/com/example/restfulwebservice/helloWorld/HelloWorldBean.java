package com.example.restfulwebservice.helloWorld;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
