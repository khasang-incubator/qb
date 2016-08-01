package io.khasang.qb.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class DropTable {
    private JdbcTemplate jdbcTemplate;

    public DropTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DropTable() {
    }

    public String dropTable() {
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS distributors");
            return "The table was dropped";
        } catch (Exception e) {
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
