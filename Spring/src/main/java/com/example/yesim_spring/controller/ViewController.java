package com.example.yesim_spring.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController implements ErrorController {

//    @GetMapping({"/", "/error", ""})
//    public String index() {
//        return "../static/index.html";
//    }

//    @RequestMapping(value = "/{path:[^\\.]*}")
//    public String redirect() {
//        return "forward:/";
//    }
}
