package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.PizzaDAO;
import io.khasang.qb.entity.Pizza;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PizzaDAOImpl implements PizzaDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public PizzaDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
        public void addPizza(Pizza pizza) {
            sessionFactory.getCurrentSession().save(pizza);
        }

//    @Override
//    public void updatePizza(Pizza pizza) {
//        // saving old password if do not provided new
//            final String query = "SELECT question from question WHERE id=:id";
//            String oldPizza = (String) sessionFactory.
//                    getCurrentSession().
//                    createSQLQuery(query).
//                    setParameter("id", pizza.getId()).
//                    uniqueResult();
//            pizza.setPizza(oldPizza);
//        sessionFactory.getCurrentSession().update(pizza);
//    }

    @Override
    public void deletePizza(Pizza pizza) {
        final Session session = sessionFactory.getCurrentSession();
        session.delete(pizza);
        session.flush();
    }

    @Override
    public Pizza getPizzaById(int id) {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Pizza.class);
            criteria.add(Restrictions.eq("id", id));
        return (Pizza) criteria.uniqueResult();
    }

    @Override
    public Pizza getPizzaByName(String name) {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Pizza.class);
        criteria.add(Restrictions.eq("name", name));
        return (Pizza) criteria.uniqueResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Pizza> getPizzaList() {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Pizza.class);
        return (List<Pizza>) criteria.list();
    }

}
