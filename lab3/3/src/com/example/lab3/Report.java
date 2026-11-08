package com.example.lab3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет по зарплате: ");
        System.out.printf("%-15.15s | %10s%n","ФИО", "Зарплата");
        for (Employee emp : employees) {
            System.out.format("%-15.15s | %.2f руб. %n",
                    emp.getFullname(),
                    emp.getSalary());
        }


    }

}
