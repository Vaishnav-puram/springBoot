package com.example.springDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
    @RequestMapping("/")
    public String home(){
        return "Welcome to Spring !";
    }
     @RequestMapping("/test")
     public String demo(){
         return "Hello Vaishnav!";
     }

    @RequestMapping("/web")
    public String web(){
        return "home";
    }

}
