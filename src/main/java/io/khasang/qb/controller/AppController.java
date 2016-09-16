package io.khasang.qb.controller;

import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.dao.QuestionsDao;
import io.khasang.qb.dao.RolesDao;
import io.khasang.qb.entity.Answers;
import io.khasang.qb.entity.Questions;
import io.khasang.qb.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private AnswersDao answersDao;

    @Autowired
    private QuestionsDao questionsDao;

    @Autowired
    private RolesDao rolesDao;

    @RequestMapping("/")
    public String hello(Model model) {
        List<Answers> answerses = answersDao.getAll();
        model.addAttribute("answerses", answerses);

        List<Questions> questionses = questionsDao.getAll();
        model.addAttribute("questionses", questionses);

        List<Roles> roleses = rolesDao.getAll();
        model.addAttribute("roleses", roleses);

        return "hello";
    }

}
