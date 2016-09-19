package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.Users;

public class UsersDaoImpl extends BaseDaoImpl<Users> implements UsersDao<Users> {
    @Override
    public Class<Users> getEntityName() {
        return Users.class;
    }
}
