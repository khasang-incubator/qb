package io.khasang.qb.dao;

import io.khasang.qb.entity.Pizza;

import java.util.List;

public interface QuestionDAO {
    void addPizza(Pizza pizza);

    void updatePizza(Pizza pizza);

    void deletePizza(Pizza pizza);

    Pizza getPizzaById(int id);

    Pizza getPizzaByName(String name);

    List<Pizza> getPizzaList();

}
