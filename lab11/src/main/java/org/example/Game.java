package org.example;

public class Game {
    protected String name;
    protected int rating;

    public Game(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void play(){
        System.out.println("Играю");
    }
    public void play(int level){
        System.out.println("Играю на уровне: "+level);
    }
    public void play(String mode){
        System.out.println("Играю в режиме: "+mode);
    }
    public String getDifficulty(){
        return "Средняя";
    }

    @Override
    public String toString() {
    return "Игра: "+name+" Рейтинг: "+rating+ " Сложность: "+getDifficulty();}
    }


