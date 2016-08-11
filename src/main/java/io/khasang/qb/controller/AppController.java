package io.khasang.qb.controller;

import io.khasang.qb.model.CreateTable;
import io.khasang.qb.model.Hello;
import io.khasang.qb.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    Message message;

    @Autowired
    CreateTable createTable;

    @Autowired
    Hello hello;

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

    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("create", createTable.createTable());
        return "create";
    }

    @RequestMapping(value = {"hello/{name}"}, method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("testview");
        modelAndView.addObject("crypt", new BCryptPasswordEncoder().encode(name));
        return modelAndView;
    }

}
