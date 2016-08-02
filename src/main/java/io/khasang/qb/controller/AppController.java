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
    InsertUser insertUser;

    @Autowired
    DeleteUser deleteUser;

    @Autowired
    UpdateUser updateUser;

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
    public String create(Model model){
        model.addAttribute("create", createTable.createTable());
        return "create";
    }

    @RequestMapping("/insert")
    public String insertUser(Model model){
        model.addAttribute("insert", insertUser.insertUser());
        return "insert";
    }

    @RequestMapping("/delete")
    public String deleteUser(Model model){
        model.addAttribute("delete", deleteUser.deleteUser());
        return "delete";
    }

    @RequestMapping("/update")
    public String updateUser(Model model){
        model.addAttribute("update", updateUser.updateUser());
        return "update";
    }

}
