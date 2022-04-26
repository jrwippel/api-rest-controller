package com.jrwsolucoesti.apirestcontroller.controller;

import com.jrwsolucoesti.apirestcontroller.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @Autowired
    private Service service;

    @RequestMapping("/welcome")
    public String welcome(){
        return service.retrieveMsg();
    }


}
