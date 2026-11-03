package com.example.FirstSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer {

    public Pencil() {
        System.out.println("Pencil is called");
    }

    public void write()
    {
        System.out.println("Write using pencil");
    }

}
