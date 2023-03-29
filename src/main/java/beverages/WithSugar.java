package beverages;

public class WithSugar extends BeverageWithSupplement {

    public WithSugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 0.1;
    }
    
}
