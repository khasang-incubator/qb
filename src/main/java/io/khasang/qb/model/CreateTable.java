package io.khasang.qb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public CreateTable() {
    }

    public String createTable() {
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS distributors;");
            jdbcTemplate.execute("CREATE TABLE distributors (\n" +
                    "    id     integer,\n" +
                    "    name    varchar(40),\n" +
                    "    PRIMARY KEY(id)\n" +
                    ");");
            return "DB created";
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
