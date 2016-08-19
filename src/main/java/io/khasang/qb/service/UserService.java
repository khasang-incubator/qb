package io.khasang.qb.service;

import io.khasang.qb.dao.UserDAO;
import io.khasang.qb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("UserService")
@Transactional
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

}
