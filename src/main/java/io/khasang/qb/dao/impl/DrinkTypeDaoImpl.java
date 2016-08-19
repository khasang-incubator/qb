package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.DrinkTypeDao;
import io.khasang.qb.entity.Drink;
import io.khasang.qb.entity.DrinkType;
import io.khasang.qb.entity.Question;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrinkTypeDaoImpl implements DrinkTypeDao{
    @Autowired
    SessionFactory sessionFactory;

    public DrinkTypeDaoImpl() {
    }


    @Override
    public List<DrinkType> getAll(){
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(DrinkType.class);
        return (List<DrinkType>) criteria.list();
    }

    @Override
    public Drink getDrinkTypeById(int id) {
        return new Drink();
    }
}
