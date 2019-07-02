package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","小明");
        return "hello";
    }
}
