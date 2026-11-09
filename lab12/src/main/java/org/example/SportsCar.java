package org.example;

public class SportsCar extends Auto {
    private int topSpeed;

    public SportsCar(String brand, int id, int horsepower, int topSpeed) {
        super(brand, id, horsepower);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    @Override
    public String toString() {
        return String.format("SportsCar{brand='%s', id=%d, horsepower=%d, topSpeed=%d}",
                brand, id, horsepower, topSpeed);
    }
}
