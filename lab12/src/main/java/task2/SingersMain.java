package task2;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class SingersMain {
    public static List<Singer> removeSinger (List<Singer> singers, double threshold){
        List<Singer> result = new ArrayList<>(singers);
        Iterator<Singer> it = result.iterator();
        while(it.hasNext()){
            Singer s = it.next();
            if (s.getAverageAlbumRating()< threshold){
                System.out.printf("Артист %s был удален.%n", s.getName());
                it.remove();
            }
        }
        return result;
    }
    public static void boostSinger(List<Singer> singers, double ratingThreshold, int notOld){
        for (Singer s : singers){
            if (s.getAverageAlbumRating() >= ratingThreshold){
                int old = s.getPopularity();
                s.setPopularity(old+notOld);
                System.out.printf("У артиста %s повысилась популярность с %d до %d. У него купил рекламу betera.%n", s.getName(), old, s.getPopularity());
            }
        }
    }
    public static void printSingers(List<Singer> singers, int popularity){
        for (Singer s : singers){
            System.out.printf("Артист %s популярен на столько %d", s.getName(), s.getPopularity());
        }
    }
    public static List<Singer> sortSinger(List<Singer> singers){
        List<Singer> sorted = new ArrayList<>(singers);
        int n = sorted.size();
        for(int i=0; i<n-1;i++){
            for(int j=0; j<n-1-i; j++){
                Singer s1 = sorted.get(j);
                Singer s2 = sorted.get(j+1);
                boolean needSwap = false;
                if(s1.getAverageAlbumRating()<s2.getAverageAlbumRating()){
                    needSwap=true;
                }
                else if (s1.getAverageAlbumRating() == s2.getAverageAlbumRating()){
                    if(s1.getName().compareTo(s2.getName())>0){
                        needSwap=true;
                    }
                }
                if(needSwap){
                    sorted.set(j,s2);
                    sorted.set(j+1, s1);
                }
            }
        }
        for(Singer s : sorted){
        System.out.printf("Артист %s имеет средний рейтинг %.2f, его порядковый номер: %d%n", s.getName(), s.getAverageAlbumRating(), s.getId());}
        return sorted;
    }
    public static void main(String[] args) {
        List<Integer> album1 = List.of(9, 8, 10);
        List<Integer> album2 = List.of(7, 8, 7);
        List<Integer> album3 = List.of(9, 9, 9);
        List<Integer> album4 = List.of(3, 4, 2);
        List<Integer> album5 = List.of(3, 4, 2);

        List<Singer> singers = new ArrayList<>();
        singers.add(new Singer(1, "Аля Бугачева", "ШАНСон", 99, album1));
        singers.add(new Singer(2, "ssshhhiiitttGUN", "Инди-рок", 10, album2));
        singers.add(new Singer(3, "SoloWay", "Фонк", 88, album3));
        singers.add(new Singer (4, "Житомир", "Псевдо-металл", 14, album4));
        singers.add(new Singer(5, "Зингер", "РЭПЧИК", 67, album5 ));
        System.out.println();
        List<Singer> sorted = sortSinger(singers);
        System.out.println();
        boostSinger(sorted, 8.0, 15);
        System.out.println();
        printSingers(sorted, 50);
        System.out.println();
        List<Singer> cleanedList = removeSinger(sorted, 5.0);
        System.out.println();
        System.out.println("Артисты после нашего тщательного отбора: ");
        for (Singer s : cleanedList) {
            System.out.println(s);
        }
    }
}
