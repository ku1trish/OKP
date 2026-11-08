import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Введите номер задания: 1, 2, 3. Выход - 0");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.print("Задание 1. Площадь поверхности куба ");
                    System.out.print("Введите a: ");
                    double a = scanner.nextDouble();
                    double s = 6 * Math.pow(a, 2);
                    System.out.print("Площадь куба со сторонами а = " + a + " равна " + s);
                    break;
                case 2:
                    boolean back = false;
                    while (!back) {
                        System.out.print("Задание 2. Операции +,-,*,/");
                        System.out.print("Введите номер операции: 1 - сложение; 2 - вычитание; 3 - деление; 4 - умножение; 5 - остаток от деления, 0 - выход.");
                        int number1 = scanner.nextInt();
                        switch (number1) {
                            case 0:
                                back = true;
                                break;
                            case 1:
                                System.out.print("Введите первое слогаемое: ");
                                int slog1 = scanner.nextInt();
                                System.out.print("Введите второе слогаемое: ");
                                int slog2 = scanner.nextInt();
                                int sum = slog1 + slog2;
                                System.out.print(slog1 + "+" + slog2 + "=" + sum);
                                break;
                            case 2:
                                System.out.print("Введите уменьшаемое: ");
                                int umen = scanner.nextInt();
                                System.out.print("Введите вычитаемое: ");
                                int vych = scanner.nextInt();
                                int razn = umen - vych;
                                System.out.print(umen + "-" + vych + "=" + razn);
                                break;
                            case 3:
                                System.out.print("Введите делимое: ");
                                int delim = scanner.nextInt();
                                if (delim == 0) {
                                    System.out.print("Делимое не может быть равно нулю");
                                }
                                System.out.print("Введите делитель: ");
                                int delit = scanner.nextInt();
                                if (delit == 0) {
                                    System.out.print("Делитель не может быть равен нулю");
                                }
                                int chast = delim / delit;
                                System.out.print(delim + "/" + delit + "=" + chast);
                                break;
                            case 4:
                                System.out.print("Введите первый множитель: ");
                                int mnozh1 = scanner.nextInt();
                                System.out.print("Введите второй множитель: ");
                                int mnozh2 = scanner.nextInt();
                                int proizv = mnozh1 * mnozh2;
                                System.out.print(mnozh1 + "*" + mnozh2 + "=" + proizv);
                                break;
                            case 5:
                                System.out.print("Введите делимое: ");
                                int delim1 = scanner.nextInt();
                                System.out.print("Введите делитель: ");
                                int delit1 = scanner.nextInt();
                                if (delit1 == 0) {
                                    System.out.print("Делитель не может быть равен нулю");}
                                    int chast1 = delim1 % delit1;
                                    System.out.print(delim1 + "%" + delit1 + "=" + chast1);
                                    break;


                        }
                    }
                    break;
                case 3:
                    System.out.println("Задание 3. Игра \"Угадай число\"");
                    Random random = new Random();
                    int min = 1, max = 100;
                    int count = 0;
                    int num = random.nextInt(max - min + 1) + min;
                    int num1 = 0;
                    while (num != num1) {
                        System.out.println("Ваше число: ");
                        num1 = scanner.nextInt();
                        if (num1 < 0 || num1 > 100) {
                            System.out.println("Число загадано в диапазоне от 1 до 100");
                        } else {
                            count++;
                            if (num1 < num) {
                                System.out.print("Больше.");
                                System.out.println(" Попыток " + count);
                            } else if (num1 > num) {
                                System.out.print("Меньше.");
                                System.out.println(" Попыток " + count);
                            } else {
                                System.out.println("Верно! Загаданное число " + num);
                                System.out.println("Попыток совершено: " + count);
                            }

                        }
                    }
                case 0:
                    System.out.print("Завершение программы.");
                    run = false;
                    break;
            }
        }
    }
}