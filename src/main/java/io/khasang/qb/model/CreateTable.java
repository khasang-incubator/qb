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

    public CreateTable(){

    }

    public CreateTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String createTable(){
        try{
            jdbcTemplate.execute("DROP TABLE IF EXISTS test;");
            jdbcTemplate.execute("CREATE TABLE test(\n" +
                                "   id SERIAL PRIMARY KEY , \n" +
                                "   name VARCHAR(40)\n);");
            return "DB created";
        } catch (Exception e){
            return e.toString();
        }
    }
}
