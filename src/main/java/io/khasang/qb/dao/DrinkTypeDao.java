package io.khasang.qb.dao;

import io.khasang.qb.entity.Drink;
import io.khasang.qb.entity.DrinkType;

import java.util.List;

public interface DrinkTypeDao {
    public List<DrinkType> getAll();
    public Drink getDrinkTypeById(int id);
}
