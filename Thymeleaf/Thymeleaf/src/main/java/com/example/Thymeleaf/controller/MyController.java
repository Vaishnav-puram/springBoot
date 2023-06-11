package com.example.Thymeleaf.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class MyController {
    @GetMapping("/home")
    //@RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("name","vaishnav");
        model.addAttribute("age",23);
        model.addAttribute("city","bangaluru");
        model.addAttribute("currentDate",new Date());
        return "home";
    }
}
