package io.khasang.qb.model;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 */
public class UpdateUser {
    private JdbcTemplate jdbcTemplate;

    public UpdateUser() {
    }

    public UpdateUser(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String updateUser(){
        try {
            jdbcTemplate.execute("UPDATE distributors SET name = 'Marina' WHERE id ='1';");
            return "User was update.";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
