package org.example.demols1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;
@Controller
@RequestMapping(value = {"/","/home"})
public class HomeController {
    @GetMapping
    public String home(){
        return "home";
    }
}
