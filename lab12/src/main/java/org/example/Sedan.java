package org.example;

public class Sedan extends Auto {
    private double trunkVolume;

    public Sedan(String brand, int id, int horsepower, double trunkVolume) {
        super(brand, id, horsepower);
        this.trunkVolume = trunkVolume;
    }

    public double getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(double trunkVolume) {
        this.trunkVolume = trunkVolume;
    }
    @Override
    public String toString() {
        return String.format("Sedan{brand='%s', id=%d, horsepower=%d, trunkVolume=%f}",
                brand, id, horsepower, trunkVolume);
    }
}
