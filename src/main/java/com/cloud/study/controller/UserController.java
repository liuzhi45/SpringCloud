package com.cloud.study.controller;

import com.cloud.study.dao.repositry.UserRepositry;
import com.cloud.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepositry userRepositry;

    @Autowired
    private IUserService service;

    @GetMapping(value = "/user",produces ="application/json" )
    public Object getUser(){

        return userRepositry.findAll();
    }

    @GetMapping(value = "/userById",produces ="application/json" )
    public Object getUserById(@RequestParam("id") Integer id){

        return service.getById(id);
    }
}
