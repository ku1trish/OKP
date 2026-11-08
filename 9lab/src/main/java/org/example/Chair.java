package org.example;

class Chair extends Furniture {
    private boolean backrest;

    public Chair(String name, String material, double price, boolean backrest) {
        super(name, material, price);
        this.backrest = backrest;
    }

    @Override
    public void getPurpose() {
        System.out.println("Для сидения");
    }

    @Override
    public void getDimensions() {
        System.out.println("40x40x90 см");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println(" Спинка: "+backrest);
    }
}
