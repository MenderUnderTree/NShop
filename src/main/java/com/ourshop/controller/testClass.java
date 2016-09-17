package com.ourshop.controller;

import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 2016/9/8.
 */
@RestController
@RequestMapping("/user")
public class testClass {
    @RequestMapping("/test")
    public String test(){

        return "hello";
    }
}
