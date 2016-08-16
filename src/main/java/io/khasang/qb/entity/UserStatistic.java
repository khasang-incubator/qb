package io.khasang.qb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStatistic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int passedTestsAmount;

    private int passedQuestionsAmount;

    private int rightAnswersAmount;

    private double averageTime;

    public UserStatistic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassedTestsAmount() {
        return passedTestsAmount;
    }

    public void setPassedTestsAmount(int passedTestsAmount) {
        this.passedTestsAmount = passedTestsAmount;
    }

    public int getPassedQuestionsAmount() {
        return passedQuestionsAmount;
    }

    public void setPassedQuestionsAmount(int passedQuestionsAmount) {
        this.passedQuestionsAmount = passedQuestionsAmount;
    }

    public int getRightAnswersAmount() {
        return rightAnswersAmount;
    }

    public void setRightAnswersAmount(int rightAnswersAmount) {
        this.rightAnswersAmount = rightAnswersAmount;
    }

    public double getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(double averageTime) {
        this.averageTime = averageTime;
    }
}
