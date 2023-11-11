package com.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MyControllerTest {

    @Autowired
    private MyController myController;



    @Test
    public void getResponseTest(){
        assertEquals("Pong",myController.getResponse());
    }
}
