package com.thattallprogrammer.evoserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NavigationController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
