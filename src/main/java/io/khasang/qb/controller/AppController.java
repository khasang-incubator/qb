package io.khasang.qb.controller;

import io.khasang.qb.model.CreateTable;
import io.khasang.qb.model.Hello;
import io.khasang.qb.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    CreateTable createTable;

    @Autowired
    Message message;

    @Autowired
    Hello hello;

    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("create", createTable.createTable());
        return "create";
    }

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "basic spring");
        return "hello";
    }

    @RequestMapping("/hello")
    public String next(Model model) {
        model.addAttribute("row", hello.getHello());
        return "next";
    }

    @RequestMapping("/confidential/hello")
    public String confidential(Model model){
        model.addAttribute("message", "How do you receive access to this secure page????!!!!");
        return "message";
    }

}
