package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.BaseDao;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public T getById(int id) {
        Criteria criteria = sessionFactory.
                getCurrentSession().createCriteria(getEntityName());
        criteria.add(Restrictions.eq("id", id));
        return (T) criteria.uniqueResult();
    }

    public List<T> getAll() {
        Criteria criteria = sessionFactory.
                getCurrentSession().createCriteria(getEntityName()).addOrder(Order.asc("id"));
        return (List<T>) criteria.list();
    }

    public abstract Class<T> getEntityName();
}
