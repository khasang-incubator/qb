package io.khasang.qb.entity;

import javax.persistence.*;

@Entity
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String question;
}
