package org.example;

public class Ship {
    private String name;
    private Double length;
    private Double tonnage;

    public Ship(String name, double length, double tonnage) {
        this.name = name;
        this.length = length;
        this.tonnage = tonnage;
    }

    public String getName() {return name;}
    public Double getLength() {return length;}
    public Double getTonnage() {return tonnage;}

    @Override
    public String toString(){return "Корабль: "+name+ ". Длина: "+length+". Водоизмещение: "+tonnage;}
}
