package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.User;

public class UsersDaoImpl extends BaseDaoImpl<User> implements UsersDao<User> {
    @Override
    public Class<User> getEntityName() {
        return User.class;
    }
}
