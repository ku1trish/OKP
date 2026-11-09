package org.example;

public abstract class Furniture {
    public String name;
    public String material;
    public double price;

    public Furniture (String name, String material, double price){
        this.name=name;
        this.material=material;
        this.price=price;
    }

    public String getName(){return name;}
    public String material(){return material;}
    public double price(){return price;}

    public void setName(String name){this.name=name;}
    public void setMaterial(String material){this.material=material;}
    public void setPrice(double price){this.price=price;}

    public abstract void getPurpose();
    public abstract void getDimensions();

    public void displayInfo(){
        System.out.println("Название: "+name+" Mатериал: "+material+" Цена: "+price);
    }
}
