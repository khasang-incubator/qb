package io.khasang.qb.controller;

import io.khasang.qb.model.Message;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    private static final Logger log = Logger.getLogger(AppController.class);

    @Autowired
    Message message;

//    @Autowired
//    OfferDAO offerDAO;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", message.getHello());
        log.info(message.getHello());
        return "hello";
    }

//    @RequestMapping("/krokodil")
//    public String krokodil(Model model) {
//        model.addAttribute("krokodil", offerDAO.insertData(2, "krokodil"));
//        return "krokodil";
//    }


}
