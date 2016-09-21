package io.khasang.qb.logic;

import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class Authentication {
    @Autowired
    private UsersDao usersDao;

    private User user;

    public Authentication(User user) {
        this.user = user;
    }

    public boolean isCorrect() {
        User authUser = usersDao.getByLogin(user.getLogin());
        return authUser.getPassword().equals(user.getPassword());
    }
}
