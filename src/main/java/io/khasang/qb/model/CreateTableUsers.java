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
                    "    password    VARCHAR (45) NOT NULL,\n" +
                    "    enabled BOOLEAN NOT NULL DEFAULT 'true', \n" +
                    "    PRIMARY KEY(username)\n" +
                    ");");
            return "users table created";
        } catch (Exception e) {
            return e.toString();
        }
    }

}
