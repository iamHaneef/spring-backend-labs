package com.example.FirstApi.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
        System.out.println("HelloService");
    }

    public String start() {
        return "Start Hello World!";
    }

    public String stop() {
        return "Stop Hello World!";
    }
}
