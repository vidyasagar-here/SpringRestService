package com.app.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController  implements ErrorController{
	

	@GetMapping(value = "/hello")
	public String getInit() {

        return "Hi Sagar";
    }

    @GetMapping(value = "/bye")
    public String getBye() {

        return "Bye Sagar";
    }

}
