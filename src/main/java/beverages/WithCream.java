package beverages;

public class WithCream extends BeverageWithSupplement {

    public WithCream(Beverage beverage) {
        super(beverage);
    }

    public double price() {
        return beverage.price() + 0.15;
    }
    
}
