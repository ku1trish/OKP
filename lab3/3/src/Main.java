import com.example.lab3.Employee;
import com.example.lab3.Report;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер задания: 1, 2, 3, 4, 0 - выход");
        int n = sc.nextInt();
        sc.nextLine();
        switch (n) {
            case 0:
                break;
            case 1:
                System.out.println("Задание 1. Извлечение подстроки");
                System.out.println("Введите строку");
                String str = sc.nextLine();
                if (str.length() >= 4) {
                    String pstr = str.substring(0, 4);
                    System.out.println("Извлеченная подстрока: " + pstr);
                } else {
                    System.out.println("Невозможно извлечь подстроку");
                }
                break;
            case 2:
                System.out.println("Задание 2. Количество слов");
                System.out.println("Введите предложение: ");
                String s = sc.nextLine();
                String[] words = s.split(" ");
                int count = words.length;
                System.out.println("Количество слов в предложении: " + count);
                break;
            case 3:
                Employee[] employees = {
                        new Employee("Игнатенкоooooo Ф.Б.", 2500.50),
                        new Employee("Железняк Н.В.", 3000.55),
                        new Employee("Баль Ж.А.", 2450.60)
                };
                Report.generateReport(employees);
                break;
            case 4:
                System.out.println("Задание 4. a1a a2a a123a a24a a246a");
                String a = "a1a a2a a123a a24a a246a";
                String[] as = a.split(" ");
                Pattern p = Pattern.compile("a[02468]{1,3}a");
                Matcher m = p.matcher(a);
                while (m.find()){
                    System.out.println(m.group());
                }
                break;
            default:
                System.out.println("Неверный номер задания.");
        }
    }
}