package org.example;

import java.io.*;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random rnd = new Random();
        try (BufferedWriter writerf = new BufferedWriter(new FileWriter(f))) {
            for (int i = 0; i < 50; i++) {
                writerf.write(Integer.toString(rnd.nextInt(100)));
                writerf.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
        try (BufferedReader readerf = new BufferedReader(new FileReader(f));
             BufferedWriter writerg = new BufferedWriter(new FileWriter(g));
             BufferedWriter writerh = new BufferedWriter(new FileWriter(h))) {

            String line;
            while ((line = readerf.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                if (n % 11 == 0) {
                    writerg.write(Integer.toString(n));
                    writerg.newLine();
                } else {
                    writerh.write(Integer.toString(n));
                    writerh.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
        System.out.println("=== Исходный файл ===");
        printFile(f);
        System.out.println("=== Кратные 11 ===");
        printFile(g);
        System.out.println("=== Остальные ===");
        printFile(h);
    }
    static void printFile(File file) {
        try (BufferedReader r = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = r.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения " + file.getName() + ": " + e.getMessage());
        }
    }
}