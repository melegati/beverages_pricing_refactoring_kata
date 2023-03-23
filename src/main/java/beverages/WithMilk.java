package beverages;

public class WithMilk extends BeverageWithSupplement {

    public WithMilk(Beverage beverage){
        super(beverage);
    }

    public double price() {
        return beverage.price() + 0.10;
    }
    
}
