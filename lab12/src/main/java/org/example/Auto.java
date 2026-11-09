package org.example;

public class Auto {
    protected String brand;
    protected int id;
    protected int horsepower;

    public Auto(String brand, int id, int horsepower) {
        this.brand = brand;
        this.id = id;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
