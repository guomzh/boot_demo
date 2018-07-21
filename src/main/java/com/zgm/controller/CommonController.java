package com.zgm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "Hello ,my shixi trip !" ;
    }
}
