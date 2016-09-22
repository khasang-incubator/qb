package io.khasang.qb.logic;

import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Authentication {
    @Autowired
    private UsersDao usersDao;

    public Authentication() {
    }

    public boolean isCorrect(User user) {
        User authUser = usersDao.getByLogin(user.getLogin());
        return authUser != null && authUser.getPassword().equals(user.getPassword());
    }
}
