package io.khasang.qb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "basic spring");
        return "index";
    }

    @RequestMapping("/hello")
    public String next(Model model) {
        model.addAttribute("row", "row");
        return "next";
    }

}
