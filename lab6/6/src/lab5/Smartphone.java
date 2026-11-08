package lab5;

public class Smartphone {
    public String brand;
    public Double screenSize;
    public int batteryLife;

    public static int useAge;
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Smartphone(String brand, Double screenSize, int batteryLife, int age) {
        this(brand, screenSize, batteryLife);
        this.age = age;
    }

    public static void test1(Smartphone s) {
        System.out.println("Brand: " + s.brand + "Screen size: " + s.screenSize + "Battery life: " + s.batteryLife + "Use age: " + s.useAge + "Age: " + s.age);
    }

    public void test2() {
        System.out.println("Brand: " + this.brand + "Screen size: " + this.screenSize + "Battery life: " + this.batteryLife + "Use age: " + this.useAge + "Age: " + this.age);
    }
    /*
    Smartphone.test1();
    phone.test2();
     */

























    public Smartphone(String brand, Double screenSize, int batteryLife) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isGoodBattery() {
        return batteryLife > 10;
    }

    @Override
    public String toString() {
        return "Смартфон. Бренд: " + brand + ". Размер экрана: " + screenSize + ". Батарея: " + (isGoodBattery() ? "Хорошая" : "Плохая");
    }
}
