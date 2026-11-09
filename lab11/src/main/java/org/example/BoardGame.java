package org.example;

public class BoardGame extends Game {
    private int players;

    public BoardGame(String name, int rating, int players) {
        super(name, rating);
        this.players = players;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }


    public void play(int players, String mode) {
        System.out.println(players + " играют в режиме " + mode);
    }

    @Override
    public String getDifficulty() {
        return "Легкая";
    }

    @Override
    public String toString() {
        return "Игра: " + name + " Рейтинг: " + rating + " Cложность: " + getDifficulty();
    }

    ;
}
