package com.metlife.azuredevopsspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class homeController
{
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index(){
        return "Hello world with Spring Boot (change azure repo)";
    }
}
