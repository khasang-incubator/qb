package io.khasang.qb.controller;

import io.khasang.qb.dao.OfferDAO;
import io.khasang.qb.model.Message;
import org.apache.log4j.Logger;
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
//    private static final Logger log = Logger.getLogger(AppController.class);

    @Autowired
    Message message;

    @Autowired
    OfferDAO offerDAO;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/confidential/hello")
    public String message(Model model){
        model.addAttribute("message", "Welcome to this secure page!?");
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
    
    @RequestMapping("/rest")
    public String rest() {
        return "rest";
    }

    @RequestMapping("/krokodil")
    public String krokodil(Model model) {
        model.addAttribute("krokodil", offerDAO.insertData(2, "krokodil"));
        return "krokodil";
    }

}
