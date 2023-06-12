package com.example.annotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class home {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String getHome(){
        return "Home";
    }
}
