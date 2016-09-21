package io.khasang.qb.controller;

import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.dao.QuestionsDao;
import io.khasang.qb.dao.RolesDao;
import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.Answers;
import io.khasang.qb.entity.Questions;
import io.khasang.qb.entity.Roles;
import io.khasang.qb.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private AnswersDao answersDao;

    @Autowired
    private QuestionsDao questionsDao;

    @Autowired
    private RolesDao rolesDao;

    @RequestMapping("/")
    public String hello(Model model) {
        List<Answers> answers = answersDao.getAll();
        model.addAttribute("answers", answers);

        List<Questions> questions = questionsDao.getAll();
        model.addAttribute("questions", questions);

        List<Roles> roles = rolesDao.getAll();
        model.addAttribute("roles", roles);

        Users users = (Users) usersDao.getById(1);
        model.addAttribute("users", users);

        return "hello";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        return "test";
    }

    @RequestMapping("/regist")
    public String regist(Model model) {
        model.addAttribute("user", new Users());
        return "regist";
    }

    @RequestMapping(value = "/registadd", method = RequestMethod.POST)
    public String addRegist(@ModelAttribute Users user, Model model) {
        user.setRole(rolesDao.getById(1));
        System.out.println(user.getLogin() + " " + user.getId() + " " + user.getPassword() + " " + user.getRole().getName());
        usersDao.saveEntity(user);
        return "test";
    }
}