package org.example;

public class SUV extends Auto {
    private int groundClearance;

    public SUV(String brand, int id, int horsepower, int groundClearance) {
        super(brand, id, horsepower);
        this.groundClearance = groundClearance;
    }

    public int getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }
    @Override
    public String toString() {
        return String.format("SUV{brand='%s', id=%d, horsepower=%d, groundClearance=%d}",
                brand, id, horsepower, groundClearance);
    }
}
