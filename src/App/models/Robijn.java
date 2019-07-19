package App.models;

public class Robijn extends Product{
    public Robijn(String name, int price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount(int numberOfRobijn){
        double cost = 0;
        if(numberOfRobijn % 2 == 0){
            cost = super.getPrice() * 0.69;
        }
        return cost;

    }
}
