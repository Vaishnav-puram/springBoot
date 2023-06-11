package com.example.Thymeleaf.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @GetMapping("/forEach")
    public String iterator(Model model){
        List<String> list=new ArrayList<>();
        list.add("ajay");
        list.add("vijay");
        list.add("vimal");
        list.add("kamal");
        model.addAttribute("names",list);
        return "iterator";
    }

    @GetMapping("/condition")
    public String conditional(Model m){
        m.addAttribute("isActive",true);
        m.addAttribute("gender",'M');
        List<Integer> list=List.of(23,11,24,54,77,98,101);
        m.addAttribute("nums",list);
        return "condition";
    }

    @GetMapping("/fragment")
    public String fragments(){

        return "fragments";
    }
}
