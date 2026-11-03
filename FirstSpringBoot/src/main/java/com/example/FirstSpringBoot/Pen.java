package com.example.FirstSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer {

    public Pen()
    {
        System.out.println("Pen is called");
    }

    public void write()
    {
        System.out.println("write using pen");
    }
}
