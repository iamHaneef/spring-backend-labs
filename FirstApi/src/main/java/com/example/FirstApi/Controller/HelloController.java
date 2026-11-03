package com.example.FirstApi.Controller;

import com.example.FirstApi.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//It control the HTTP request from client

@RestController
public class HelloController {

    public HelloController() {
        System.out.println("HelloController");
    }

    //we need to inject this object from HelloService.java

    @Autowired
    HelloService service;

    //it map with endpoint /
    @GetMapping("/")
    public String startHelloWorld() {
        return service.start();
    }

    @GetMapping("/stop")
    public String stopHelloWorld()
    {
        return service.stop();
    }

}
