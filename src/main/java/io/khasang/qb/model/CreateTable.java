package io.khasang.qb.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public CreateTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public CreateTable(){
    }

    public String createTable(){
        try{
            jdbcTemplate.execute("DROP TABLE test IF EXISTS ;");
            jdbcTemplate.execute("CREATE TABLE test (\n" +
                    "    id     integer,\n" +
                    "    name    varchar(40),\n" +
                    "    PRIMARY KEY(id)\n" +
                    ");");
            return "DB created";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
