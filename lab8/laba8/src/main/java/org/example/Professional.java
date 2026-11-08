package org.example;

public class Professional
{
     String name;
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

