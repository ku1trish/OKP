package org.example;

class Table extends Furniture {
    private int legs;

    public Table(String name, String material, double price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    @Override
    public void getPurpose() {
        System.out.println("Поверхность для работы");
    }

    @Override
    public void getDimensions() {
        System.out.println("120x80x75 см");
    }
}
