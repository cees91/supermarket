package App.models;

public class Product {
    private double price;
    private String name;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount = 0;
    public Product(String name, double price){
        this.price = price;
        this.name = name;
    }
    public double calculateDiscount(int numberOfProducts){
        return this.price * numberOfProducts;
    }
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }





}
