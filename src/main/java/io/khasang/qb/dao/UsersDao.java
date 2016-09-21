package io.khasang.qb.dao;

import io.khasang.qb.entity.User;

public interface UsersDao extends BaseDao<User> {

    User getByLogin(String login);
}
