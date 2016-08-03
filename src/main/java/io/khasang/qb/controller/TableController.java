package io.khasang.qb.controller;

import io.khasang.qb.model.CreateTableRoles;
import io.khasang.qb.model.CreateTableUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TableController {
    @Autowired
    CreateTableUsers createTableUsers;

    @Autowired
    CreateTableRoles createTableRoles;

    @RequestMapping("/createUser")
    public String createUser(Model model){
        model.addAttribute("create", createTableUsers.createTable());
        return "createUser";
    }

    @RequestMapping(value = "/createRoles", method = RequestMethod.GET)
    public String createRoles(Model model){
        model.addAttribute("message", createTableRoles.createTable());
        return "createRoles";
    }

}
