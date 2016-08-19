package io.khasang.qb.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Double cost;

    private boolean alcoholic;

    @ManyToOne
    private DrinkType type;

    @ManyToOne
    private Producer brand;

    @OneToMany(mappedBy = "drink")
    private Set<Sales> salesSet = new HashSet<>();

    public Drink() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }


}
