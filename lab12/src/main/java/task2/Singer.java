package task2;

import java.util.ArrayList;
import java.util.List;

public class Singer {
    protected int id;
    protected String name;
    protected String genre;
    protected int popularity;
    protected List<Integer> albumRating;

    public Singer(int id, String name, String genre, int popularity, List<Integer> albumRating) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.popularity = popularity;
        this.albumRating = new ArrayList<>(albumRating);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getPopularity() {
        return popularity;
    }

    public List<Integer> getAlbumRating() {
        return albumRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setAlbumRating(List<Integer> albumRating) {
        this.albumRating = new ArrayList<>(albumRating);
    }

    public double getAverageAlbumRating(){
        if (albumRating == null || albumRating.isEmpty()) return 0.0;
        int sum=0;
        for (int rating : albumRating) sum+=rating;
        return (double) sum/albumRating.size();
    }

    @Override
    public String toString(){
        return "Исполнитель "+name+" поет песни в жанре "+genre+" и его популярность составляет "+popularity+" среди школьников. Средний рейтинг: "+getAverageAlbumRating();
    }
}
