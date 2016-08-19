package io.khasang.qb.service;

import io.khasang.qb.dao.PizzaDAO;
import io.khasang.qb.entity.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("PizzaService")
@Transactional
public class PizzaService {
    @Autowired
    PizzaDAO pizzaDAO;

    public void addPizza(Pizza pizza) {
        pizzaDAO.addPizza(pizza);
    }

    public Pizza getPizzaById(int id) {
        return pizzaDAO.getPizzaById(id);
    }

    public List<Pizza> getQuetionList() {
        return pizzaDAO.getPizzaList();
    }

//    public void updatePizza(Pizza pizza) {
//        pizzaDAO.updatePizza(pizza);
//    }

    public void deletePizza(Pizza pizza) {
        pizzaDAO.deletePizza(pizza);
    }

}
