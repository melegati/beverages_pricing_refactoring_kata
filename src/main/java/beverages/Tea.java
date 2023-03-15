package beverages;

import java.util.ArrayList;

public class Tea extends Beverage {

    public Tea(ArrayList<Supplement> supplements){
        for (Supplement supplement : supplements) {
            addSupplement(supplement);
        }
    }

    @Override
    double initialPrice() {
        return 1.5;
    }
}
