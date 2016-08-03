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
                "  user_role_id int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  username varchar(45) NOT NULL,\n" +
                "  role varchar(45) NOT NULL,\n" +
                "  PRIMARY KEY (user_role_id),\n" +
                "  UNIQUE KEY uni_username_role (role,username),\n" +
                "  KEY fk_username_idx (username),\n" +
                "  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));";
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS user_roles;");
            jdbcTemplate.execute(sql);
            return "user_roles table created";
        } catch (Exception e) {
            return e.toString();
        }
    }

}
