import lab5.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("IPhone", 6.1, 25);
        Smartphone phoneBad = new Smartphone("Poco Phone", 5.4, 8);
        System.out.println(phone);
        System.out.println(phoneBad);
    }
}