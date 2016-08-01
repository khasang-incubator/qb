package io.khasang.qb.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class Insert {
    private JdbcTemplate jdbcTemplate;

    public Insert(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Insert() {
    }

    public String insert() {
        try {
            jdbcTemplate.execute("INSERT INTO cars (id, model, car_number, horsepower)\n" +
                    "VALUES ('1', 'BMW', '546', '450');");
            return "Insert was accepted";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
