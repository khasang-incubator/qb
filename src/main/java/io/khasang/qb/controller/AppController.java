package io.khasang.qb.controller;

import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.dao.QuestionDao;
import io.khasang.qb.dao.RolesDao;
import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.Answer;
import io.khasang.qb.entity.Question;
import io.khasang.qb.entity.Role;
import io.khasang.qb.entity.User;
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
    private QuestionDao questionsDao;

    @Autowired
    private RolesDao rolesDao;

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
//        if (new Authentication(user).isCorrect()) return "success";
//        return "fail";
        User authUser = usersDao.getByLogin(user.getLogin());
        if (authUser.getPassword().equals(user.getPassword())) return "success";
        return "fail";
    }

    @RequestMapping(value = "/registadd", method = RequestMethod.POST)
    public String addRegist(@ModelAttribute User user, Model model) {
        user.setRole(rolesDao.getById(1));
        usersDao.saveEntity(user);
        return "success";
    }
}