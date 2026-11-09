package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Shoe[] s = {
                    new Shoe("Balenciaga 3XL", 40, "black", 1490, 2),
                    new Shoe("Salomon LAB", 38, "brown", 146, 3),
                    new Shoe("Fendi Ateneo", 44, "black", 467, 4),
                    new Shoe("Rick Owens Quad Sole", 39, "black", 336, 1),
                    new Shoe("Paraboot", 30, "brown", 356, 0)
            };

            s[1].restock(10);
            s[2].sell(1);

        } catch (InvalidShoeDataException e) {
            System.out.println("Ошибка! " + e.getMessage());
        } catch (StockException | ShoeNotFoundException e) {
            System.out.println("Ошибка! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }
}