package com.zgm.controller;

import com.alibaba.fastjson.JSONArray;
import com.zgm.domain.User;
import com.zgm.service.CommonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CommonController {
    @Resource
    private CommonService commonService;
    @Value("${project.name}")
    private String p_name;
    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "Hello ,my shixi trip !"+p_name ;
    }
    @RequestMapping(value = "/allUsers" ,method = RequestMethod.GET,produces = "application/json")
    public JSONArray getAllUsers(){
        List<User> users=commonService.getAllUsers();
        return new JSONArray().fluentAddAll(users);
    }
}
