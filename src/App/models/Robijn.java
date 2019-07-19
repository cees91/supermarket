package App.models;

public class Robijn extends Product{
    public Robijn(String name, int price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount(int numberOfRobijn){
        double cost = 0;
        int remaining = numberOfRobijn /2;
        int modulus = numberOfRobijn % 2;
        int floor = Math.round(remaining);
        cost += (floor* super.getPrice()) * 0.69;
        cost += (modulus * super.getPrice());
        return cost;

    }
}
