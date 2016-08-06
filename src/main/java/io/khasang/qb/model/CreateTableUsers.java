package io.khasang.qb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateTableUsers {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public CreateTableUsers() {
    }

    public String createTable() {
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS users;");
            jdbcTemplate.execute("CREATE TABLE users (\n" +
                    "    username     VARCHAR(45) NOT NULL,\n" +
                    "    password    VARCHAR (60) NOT NULL,\n" +
                    "    enabled int NOT NULL , \n" +
                    "    PRIMARY KEY(username)\n" +
                    ");");
            return "users table created";
        } catch (Exception e) {
            return e.toString();
        }
    }

}
