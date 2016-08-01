package io.khasang.qb.controller;

import io.khasang.qb.model.CreateTable;
import io.khasang.qb.model.Message;
import io.khasang.qb.model.Stage;
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

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("hello", "basic spring");
        return "index";
    }

    @RequestMapping("/confidential/hello")
    public String message(Model model){
        model.addAttribute("message", "How you receive access to this sercure page!?");
        return "message";
    }

    @RequestMapping("/articles")
    public String articles() {
        return "articles";
    }

    @RequestMapping("/tests")
    public String tests(){
        return "tests";
    }

    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("create", createTable.createTable());
        return "create";
    }

}
