package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("speed.txt");
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Введите значение скорости (15): ");
            for (int i = 0; i < 15; i++) {
                double v = sc.nextDouble();
                writer.write(Double.toString(v));
                writer.newLine(r.);
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
        {

            double sum = 0;
            int count = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    sum += Double.parseDouble(line.trim());
                    count++;
                }
            } catch (IOException e) {
                System.out.println("Ошибка! " + e.getMessage());
                return;
            }
            if (count > 0) {
                System.out.printf("Средняя скорость: %.2f%n", sum / count);
            } else {
                System.out.println("Файл пуст.");
            }
        }
    }
}
