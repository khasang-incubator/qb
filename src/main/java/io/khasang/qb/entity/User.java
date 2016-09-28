package io.khasang.qb.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 4, max = 8, message = "Логин должен содержать от 4 до 8 символов.")
    //@Pattern(regexp = "[A-Za-z0-9]")
    @Column
    private String login;

//    @Size(min = 6, max = 10, message = "Пароль должен содержать от 6 до 10 символов.")
    //@Pattern(regexp = "[A-Za-z0-9]")
    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}