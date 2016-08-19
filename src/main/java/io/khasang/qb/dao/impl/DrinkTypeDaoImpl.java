package io.khasang.qb.dao.impl;

import io.khasang.qb.dao.DrinkTypeDao;
import io.khasang.qb.entity.Drink;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrinkTypeDaoImpl implements DrinkTypeDao{
    public DrinkTypeDaoImpl() {
    }


    @Override
    public List<Drink> getAll() {
        return null;
    }

    @Override
    public Drink getDrinkTypeById(int id) {
        return null;
    }
}
