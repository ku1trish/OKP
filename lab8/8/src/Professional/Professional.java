package Professional;

import java.awt.print.PrinterAbortException;

public class Professional {
    private String name;
    private int experience;
    private int rating;

    public Professional(String name, int experience, int rating) {
        this.name = name;
        this.experience = experience;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void work() {
        System.out.println("работает.");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + " Опыт: " + experience + " Рейтинг: " + rating);
    }

}

class Doctor extends Professional {
    private String specialization;

    public Doctor(String name, int experience, int rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Лечит пациентов.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Специализация " + specialization);
    }

    public void diagnose(){
        System.out.println("У пациент аллергия на пенициллин.");
    }

}

class Engineer extends Professional {
    private String project;

    public Engineer(String name, int experience, int rating, String project) {
        super(name, experience, rating);
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Проектирует системы.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Проект: " + project);
    }

    public void design(){
        System.out.println("Работает над проектом: " + project);
    }
}

