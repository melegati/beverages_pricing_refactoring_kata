package unit_tests;

import beverages.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import java.util.ArrayList;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee(new ArrayList<Supplement>());
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea(new ArrayList<Supplement>());
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate(new ArrayList<Supplement>());
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        ArrayList<Supplement> supplements = new ArrayList<Supplement>();
        supplements.add(new Milk());
        Tea teaWithMilk = new Tea(supplements);
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        ArrayList<Supplement> supplements = new ArrayList<Supplement>();
        supplements.add(new Milk());
        Coffee coffeeWithMilk = new Coffee(supplements);
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        ArrayList<Supplement> supplements = new ArrayList<Supplement>();
        supplements.add(new Milk());
        supplements.add(new Cream());
        Coffee coffeeWithMilkAndCream = new Coffee(supplements);
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        ArrayList<Supplement> supplements = new ArrayList<Supplement>();
        supplements.add(new Cream());
        HotChocolate hotChocolateWithCream = new HotChocolate(supplements);
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }
}
