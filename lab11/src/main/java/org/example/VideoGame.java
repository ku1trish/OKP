package org.example;

public class VideoGame extends Game {
    private String genre;

    public VideoGame(String name, int rating, String genre) {
        super(name, rating);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void play(String name, String genre){
        System.out.println("Игра "+name+" жанра "+genre);
    }
    @Override
    public String getDifficulty(){return "Сложная";}
    @Override
    public String toString(){return "Игра: "+name+" Рейтинг: "+" Жанр: "+genre+ " Сложность: "+getDifficulty();}
}
