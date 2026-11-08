package org.example;

public class Main {
    static void main() {
        Furniture[] fur = new Furniture[5];
        fur[0] = new Chair("Стул 1", "Дерево", 35.6, true);
        fur[1] = new Chair("Стул 2", "Пластик", 35.6, false);
        fur[2] = new Table("Стол 1", "Дерево", 345.4, 4);
        fur[3] = new Table("Стол 2", "Дерево", 5000.4, 4);
        fur[4] = new Table("Стол 3", "Пластик", 45, 1);

        for(Furniture f : fur){
            f.displayInfo();
            f.getDimensions();
            f.getPurpose();
        }
    }
}
