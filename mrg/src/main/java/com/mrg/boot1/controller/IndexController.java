package com.mrg.boot1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RestController
public class IndexController {


    //@RequestMapping({"/index.html"})
    public String index(){
        return "index";
    }
}
