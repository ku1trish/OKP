package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("f.txt");
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Введите 10 целых чисел: ");
            for (int i = 0; i < 10; i++) {
                int n = sc.nextInt();
                writer.write(Integer.toString(n));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
        int palindrom = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                System.out.println(n + " ");
                if (isPalindrom(n)) {
                    palindrom++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
        System.out.println("Количество палиндромов: "+palindrom);
    }
    static boolean isPalindrom(int n) {
        String s = Integer.toString(Math.abs(n));
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
