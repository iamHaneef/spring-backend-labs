package com.example.FirstSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Sketch implements Writer{

    public Sketch()
    {
        System.out.println("Creating Sketch");
    }

    public void write()
    {
        System.out.println("Write using pencil");
    }

}
