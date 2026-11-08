import lab7.Robot;

public class Main{
    public static void main (String[] args){
        Robot r1 = new Robot("R2-D2", "Astromech", 10);
        Robot r2 = new Robot("C-3PO", "Protocol", 20);
        Robot r3 = new Robot("Wall-E", "Compactor", 30);

        System.out.println(Robot.getAverageBatteryLife());
    }
}