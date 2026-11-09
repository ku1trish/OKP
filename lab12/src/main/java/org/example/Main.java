package org.example;
import java.util.Map;
import java.util.LinkedHashMap;

import java.util.LinkedHashMap;

public class Main {
    static void main() {
        Map<String, Auto> autos = new LinkedHashMap<>();
        autos.put("Toyota Camry",  new Sedan("Toyota Camry", 1, 203, 493.0));
        autos.put("Honda Accord",  new Sedan("Honda Accord", 2, 192, 473.0));
        autos.put("BMW 5 Series",  new Sedan("BMW 5 Series", 3, 335, 530.0));
        autos.put("Jeep Grand Cherokee", new SUV("Jeep Grand Cherokee", 4, 293, 21));
        autos.put("Toyota Land Cruiser", new SUV("Toyota Land Cruiser", 5, 409, 23));
        autos.put("Range Rover",         new SUV("Range Rover", 6, 355, 22));
        autos.put("Ferrari F8", new SportsCar("Ferrari F8", 7, 710, 340));
        autos.put("Porsche 911", new SportsCar("Porsche 911", 8, 450, 330));
        for(Map.Entry<String, Auto> entry:autos.entrySet()){
            System.out.println("Ключ: "+ entry.getKey());
            System.out.println("Значение: "+ entry.getValue());
            System.out.println();
        }
        for(String key : autos.keySet()){
            System.out.println(key);
        }
        for(Auto auto : autos.values())
        {
            System.out.println(auto);
        }
        }
    }
