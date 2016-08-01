package io.khasang.qb.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
    private JdbcTemplate jdbcTemplate;

    public CreateTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public CreateTable() {
    }

    public String createTable() {
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS cars;");
            jdbcTemplate.execute("CREATE TABLE cars (\n" +
                    " id integer,\n" +
                    " model varchar(40),\n" +
                    " car_number integer,\n" +
                    " horsepower integer,\n" +
                    " PRIMARY KEY(id)\n" +
                    ");");
            return "The table was created";
        } catch (Exception e) {
            return e.toString();
        }
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
