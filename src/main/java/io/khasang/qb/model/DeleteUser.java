package io.khasang.qb.model;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 */
public class DeleteUser {
    private JdbcTemplate jdbcTemplate;
    private int key;

    public DeleteUser(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DeleteUser() {
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String deleteUser() {
        try {
            jdbcTemplate.execute("DELETE FROM distributors WHERE id = " + key + ";");
            key++;
            return "User was deleted.";
        } catch (Exception e) {
            key++;
            return e.toString();
        }
    }
}
