package org.example;

public class Shoe {
    protected String brand;
    protected int size;
    protected String color;
    protected double price;
    protected int stock;

    public Shoe(String brand, int size, String color, double price, int stock)
            throws InvalidShoeDataException {
        if (brand == null) {
            throw new InvalidShoeDataException("Бренд не может быть пустым...");
        }
        if (color == null) {
            throw new InvalidShoeDataException("Цвет не может быть пустым...");
        }
        if (size > 45 || size < 20) {
            throw new InvalidShoeDataException("Размер должен быть в диапазоне между отчаянием и надеждой(20 и 50)");
        }
        if (stock < 0) {
            throw new InvalidShoeDataException("Сток не может быть меньше нуля...");
        }
        if (price <= 0) {
            throw new InvalidShoeDataException("Ты что не хочешь зарабатывать???");
        }
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public int getStock() {
        return stock;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sell(int quantity) throws StockException, ShoeNotFoundException {
        if (quantity <= 0) {
            throw new StockException("Количество обуви должно быть положительным");
        }
        if (quantity > stock) {
            throw new ShoeNotFoundException("Нету обуви такой больше.");
        }
        stock -= quantity;
        System.out.println("Товар "+brand+" в "+size+" размере был продан. Остаток: "+stock);
    }
    public void restock (int quantity){
        if(quantity<=0){
            throw new StockException("Количество пополнения не может равняться нулю или быть меньше его.");
        }
        stock +=quantity;
        System.out.println("Склад был пополнен товаром.");
    }
}
