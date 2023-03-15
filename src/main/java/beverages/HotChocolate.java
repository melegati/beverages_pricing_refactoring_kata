package beverages;

import java.util.ArrayList;

public class HotChocolate extends Beverage {

    public HotChocolate(ArrayList<Supplement> supplements){
        for (Supplement supplement : supplements) {
            addSupplement(supplement);
        }
    }

    @Override
    double initialPrice() {
        return 1.45;
    }
}
