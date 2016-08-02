package io.khasang.qb.model;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 */
public class InsertUser {
    private int userKey = 1;
    private JdbcTemplate jdbcTemplate;

    public InsertUser(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public InsertUser() {
    }

    public String insertUser() {
        try {
            jdbcTemplate.execute("INSERT INTO distributors (id,name) VALUES("+ userKey +",'Fedor');");
            userKey++;
            return "User was added.";
        } catch (Exception e) {
            userKey++;
            return e.toString();
        }
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
