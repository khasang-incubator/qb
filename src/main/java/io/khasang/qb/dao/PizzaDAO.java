package io.khasang.qb.dao;

import io.khasang.qb.entity.Pizza;

import java.util.List;

public interface PizzaDAO {
    void addPizza(Pizza pizza);

//    void updatePizza(Pizza Pizza);

    void deletePizza(Pizza Pizza);

    Pizza getPizzaById(int id);

    Pizza getPizzaByName(String name);

    List<Pizza> getPizzaList();

}
