package io.khasang.qb.controller;

import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.dao.QuestionDao;
import io.khasang.qb.dao.RolesDao;
import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.Answer;
import io.khasang.qb.entity.Question;
import io.khasang.qb.entity.Role;
import io.khasang.qb.entity.User;
import io.khasang.qb.logic.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private AnswersDao answersDao;

    @Autowired
    private QuestionDao questionsDao;

    @Autowired
    private RolesDao rolesDao;

    @Autowired
    private Authentication authentication;

    @RequestMapping("/")
    public String hello(Model model) {
        List<Answer> answers = answersDao.getAll();
        model.addAttribute("answers", answers);

        List<Question> questions = questionsDao.getAll();
        model.addAttribute("questions", questions);

        List<Role> roles = rolesDao.getAll();
        model.addAttribute("roles", roles);

        User user = usersDao.getById(1);
        model.addAttribute("users", user);

        return "hello";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        return "test";
    }


    @RequestMapping("/regist")
    public String regist(Model model) {
        model.addAttribute("user", new User());
        return "regist";
    }

    @RequestMapping("/auth")
    public String auth(Model model) {
        model.addAttribute("user", new User());
        return "auth";
    }

    @RequestMapping("/getauth")
    public String auth(@ModelAttribute User user, Model model) {
        return "success";
    }

    @RequestMapping("/auth/test")
    public String authTest(Model model) {
        return "hello";
    }

    @RequestMapping(value = "/registadd", method = RequestMethod.POST)
    public String addRegist(@Validated User user, BindingResult result, Model model) {
        if (result.hasErrors()) return "regist";
        user.setRole(rolesDao.getById(1));
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPasswordIn()));
        usersDao.saveEntity(user);
        return "success";
    }


}