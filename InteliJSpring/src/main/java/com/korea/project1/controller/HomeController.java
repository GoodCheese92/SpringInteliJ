package com.korea.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public static final String VIEW_PATH = "/WEB-INF/views/test/";
    @GetMapping("/")
    public String index(){
        return VIEW_PATH + "index.jsp";
    }
} // end of class
