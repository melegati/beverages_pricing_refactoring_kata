package beverages;

import java.util.ArrayList;

public abstract class Beverage {

    private ArrayList<Supplement> supplements = new ArrayList<Supplement>();

    protected void addSupplement(Supplement supplement){
        supplements.add(supplement);
    }

    abstract double initialPrice();

    public double price() {
        double finalPrice = initialPrice();
        for (Supplement supplement : supplements) {
            finalPrice += supplement.price();
        }
        return finalPrice;
    }


}
