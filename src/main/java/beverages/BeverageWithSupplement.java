package beverages;

public abstract class BeverageWithSupplement implements Beverage {
    
    protected Beverage beverage;

    protected BeverageWithSupplement(Beverage beverage){
        this.beverage = beverage;
    }

}
