package io.khasang.qb.dao;

import io.khasang.qb.entity.Drink;

import java.util.List;

public interface DrinkTypeDao {
    public List<Drink> getAll();
    public Drink getDrinkTypeById(int id);
}
