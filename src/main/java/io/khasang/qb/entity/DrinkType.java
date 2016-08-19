package io.khasang.qb.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DrinkType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String typeName;

    @OneToMany(mappedBy = "type")
    Set<Drink> drinkSet = new HashSet<>();

    public DrinkType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Set<Drink> getDrinkSet() {
        return drinkSet;
    }

    public void setDrinkSet(Set<Drink> drinkSet) {
        this.drinkSet = drinkSet;
    }
}
