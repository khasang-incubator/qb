package io.khasang.qb.controller;

import io.khasang.qb.dao.OfferDAO;
import io.khasang.qb.model.CreateTable;
import io.khasang.qb.model.Message;
import io.khasang.qb.service.QLoader;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class AppController {
    private static final Logger log = Logger.getLogger(AppController.class);

    @Autowired
    Message message;
    @Autowired
    CreateTable createTable;
    @Autowired
    OfferDAO offerDAO;
    @Autowired
    QLoader qLoader;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", message.getHello());
        log.info(message.getHello());
        return "hello";
    }

    @RequestMapping("/confidential/hello")
    public String message(Model model) {
        model.addAttribute("message", "How you receive access to this secure page!?");
        return "message";
    }

    @RequestMapping("/rest")
    public String rest() {
        return "rest";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", createTable.createTable());
        return "create";
    }

    @RequestMapping("/krokodil")
    public String krokodil(Model model) {
        model.addAttribute("krokodil", offerDAO.insertData(2, "krokodil"));
        return "krokodil";
    }

    @RequestMapping(value = {"hello/{name}"}, method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("testview");
        modelAndView.addObject("crypt", new BCryptPasswordEncoder().encode(name));
        return modelAndView;
    }

    @RequestMapping("/qloader")
    public String qloader(Model model) {
        String info = null;
        try {
            info = qLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            info = "Что-то пошло не так ... Вопросы не добавлены =( ";
        }
        model.addAttribute("hello", info);
        return "hello";
    }

    @RequestMapping("/index")
    public String start(Model model){
        return "index";
    }

}
