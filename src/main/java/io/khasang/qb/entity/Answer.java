package io.khasang.qb.entity;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String answer;

    @Column(name = "is_correct")
    private int isCorrect;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Answer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(int isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
