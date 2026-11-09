package org.example;

import java.io.*;
import java.nio.file.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("My_dream.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Я мечтаю о собачке Зингере");
            writer.newLine();
            writer.write("Я и Дима гуляли бы с ним");
            writer.newLine();
            writer.write("А он бы тыкал нас в локти, чтобы мы его гладили");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
        System.out.println("Название файла: " + file.getName());
        System.out.println("Путь файла: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно писать: " + file.canWrite());
        System.out.println("");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }
    }
}
