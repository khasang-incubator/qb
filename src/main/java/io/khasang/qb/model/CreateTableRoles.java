package io.khasang.qb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateTableRoles {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public CreateTableRoles() {}

    public String createTable() {
        String sql ="CREATE TABLE user_roles (\n" +
                "                user_role_id SERIAL PRIMARY KEY,\n" +
                "                username varchar(45) NOT NULL UNIQUE,\n" +
                "                role varchar(45) NOT NULL UNIQUE,\n" +
                "                FOREIGN KEY (username) REFERENCES users (username));";

        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS user_roles;");
            jdbcTemplate.execute(sql);
            return "user_roles table created";
        } catch (Exception e) {
            return e.toString();
        }
    }

}
