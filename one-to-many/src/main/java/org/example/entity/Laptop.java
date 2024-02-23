package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
    @Id
    private String lid;
    private String model;

    public Laptop() {
    }

    public Laptop(String lid, String model) {
        this.lid = lid;
        this.model = model;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid='" + lid + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
