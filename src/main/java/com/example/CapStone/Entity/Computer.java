package com.example.CapStone.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String overview;
    String systemComponents;
    int price;


    public Computer( int id,String name, String overview,
                    String systemComponents,int price) {
        this.id = id;
        this.name = name;
        this.overview = overview;
        this.systemComponents = systemComponents;
        this.price = price;
    }

    public Computer() {
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

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getSystemComponents() {
        return systemComponents;
    }

    public void setSystemComponents(String systemComponents) {
        this.systemComponents = systemComponents;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}