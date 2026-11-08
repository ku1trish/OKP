package org.example;

public class Building {
    private String address;
    private int floors;
    private int totalArea;

    public Building(String address, int floors, int totalArea){
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public  void averageAreaPerFloor(){
        int avgArea =  totalArea/floors;
        System.out.println("Средняя площадь этажа: "+ avgArea);
    }
}
