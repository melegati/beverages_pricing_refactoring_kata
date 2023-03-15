package beverages;

import java.util.ArrayList;

public class Coffee extends Beverage {

    public Coffee(ArrayList<Supplement> supplements){
        for (Supplement supplement : supplements) {
            addSupplement(supplement);
        }
    }

    public double initialPrice(){
        return 1.2;
    }
    
}
