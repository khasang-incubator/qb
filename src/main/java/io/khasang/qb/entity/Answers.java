package io.khasang.qb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int question_id;
    private String answer;
    private int is_correct;

}
