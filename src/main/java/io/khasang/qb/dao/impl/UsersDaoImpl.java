package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.UsersDao;
import io.khasang.qb.entity.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UsersDaoImpl extends BaseDaoImpl<User> implements UsersDao {
    @Override
    public Class<User> getEntityName() {
        return User.class;
    }

    @Override
    public User getByLogin(String login) {
        Criteria criteria = sessionFactory.
                getCurrentSession().createCriteria(getEntityName());
        criteria.add(Restrictions.eq("login", login));
        return (User) criteria.uniqueResult();
    }
}
