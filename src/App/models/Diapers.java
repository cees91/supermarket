package App.models;

public class Diapers extends Product {
    public Diapers(String name, int price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount(int numberOfDiapers){
        double cost = 0;
        if(numberOfDiapers == 4){
            cost = super.getPrice()* 3;
        } else{
            cost = super.getPrice() *numberOfDiapers;
        }
        return cost;
    }
}
