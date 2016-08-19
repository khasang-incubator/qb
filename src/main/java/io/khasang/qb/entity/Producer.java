package io.khasang.qb.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String brand;

    private String country;

    @OneToMany(mappedBy = "brand")
    private Set<Drink> drinkSet = new HashSet<>();

    public Producer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Drink> getDrinkSet() {
        return drinkSet;
    }

    public void setDrinkSet(Set<Drink> drinkSet) {
        this.drinkSet = drinkSet;
    }
}
