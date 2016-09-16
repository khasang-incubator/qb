package io.khasang.qb.dao;

import java.util.List;

public interface BaseDao<T> {
    T getById(int id);

    List<T> getAll();

    Class<T> getEntityName();
}
