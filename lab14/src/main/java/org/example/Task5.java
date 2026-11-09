package org.example;

import java.io.*;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("num.txt");
        Random r = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                writer.write(Integer.toString(r.nextInt(100)));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                System.out.print(n + " ");
                if (n % 8 == 0 && n != 0) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
        System.out.println("Количество чисел, кратных 8: " + count);
    }
}