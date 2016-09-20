package io.khasang.qb.config;

import io.khasang.qb.dao.AnswersDao;
import io.khasang.qb.dao.QuestionsDao;
import io.khasang.qb.dao.RolesDao;
import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.dao.impl.AnswersDaoImpl;
import io.khasang.qb.dao.impl.QuestionsDaoImpl;
import io.khasang.qb.dao.impl.RolesDaoImpl;
import io.khasang.qb.dao.impl.UsersDaoImpl;
import io.khasang.qb.entity.Answers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public AnswersDao answersDao() {
        return new AnswersDaoImpl();
    }

    @Bean
    public QuestionsDao questionsDao() {
        return new QuestionsDaoImpl();
    }

    @Bean
    public RolesDao rolesDao() {
        return new RolesDaoImpl();
    }

    @Bean
    public Answers answers() {
        return new Answers();
    }

    @Bean
    public UsersDao usersDao() {
        return new UsersDaoImpl();
    }
}