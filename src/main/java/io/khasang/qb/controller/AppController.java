package io.khasang.qb.controller;

import io.khasang.qb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    Message message;

    @Autowired
    CreateTable createTable;

    @Autowired
    DropTable dropTable;

    @Autowired
    Insert insert;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", message.getHello());
        return "hello";
    }

    @RequestMapping("/confidential/hello")
    public String message(Model model){
        model.addAttribute("message", "How you receive access to this sercure page!?");
        return "message";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", createTable.createTable());
        return "create";
    }

    @RequestMapping("/drop")
    public String drop(Model model) {
        model.addAttribute("drop", dropTable.dropTable());
        return "drop";
    }

    @RequestMapping("/insert")
    public String insert(Model model) {
        model.addAttribute("insert", insert.insert());
        return "insert";
    }

}
