package App.models;

public class Diapers extends Product {
    public Diapers(String name, int price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount(int numberOfDiapers){
        double cost = 0;
        int discountSet= 0;
        int iterator = 0;
        for(int i = 0; i < numberOfDiapers+1; i++){
            iterator ++;
            if(i % 4 == 0 && i != 0){
                discountSet ++;
            }
        }
        int restDiapers = numberOfDiapers - (discountSet * 4);
        cost = super.getPrice() * (numberOfDiapers - discountSet);
        System.out.println(cost);
        return cost;
    }
}
