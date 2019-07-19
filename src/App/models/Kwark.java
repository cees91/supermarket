package App.models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Kwark extends Product{
    public Kwark(String name, int price) {
        super(name, price);
    }
    @Override
    public double calculateDiscount(int numberOfKwarks){
        double cost = 0;
        LocalDate date = LocalDate.now();
        DayOfWeek dow = date.getDayOfWeek();
        String dayName = dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        if(dayName.equals("Wednesday")){
            cost = 1* numberOfKwarks;
        } else{
            cost = super.getPrice() * numberOfKwarks;
        }
        return cost;
    }

}
