package lesson4.pizza;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTester {

    @Test
    public void testPizzaPrice()
    {
        Pizza p = new Pizza(Pizza.PizzaSize.SMALL,0,0,0,0);
        assertEquals(10,p.calcPrice());
        Pizza pizza = new Pizza(Pizza.PizzaSize.LARGE,0,1,2,0);
        assertEquals(20,pizza.calcPrice());
        Pizza pizza1 = new Pizza(Pizza.PizzaSize.MEDIUM,1,0,0,0);
        assertEquals(14,pizza1.calcPrice());
    }

    @Test
    public void testPizzaOrderPrice()
    {
        Pizza p = new Pizza(Pizza.PizzaSize.SMALL,0,0,0,0);
        Pizza pizza = new Pizza(Pizza.PizzaSize.LARGE,0,1,2,0);
        Pizza pizza1 = new Pizza(Pizza.PizzaSize.MEDIUM,1,0,0,0);
        Pizza [] pizzas = {p,pizza,pizza1};
        PizzaOrder pizzaOrder = new PizzaOrder(pizzas);
        assertEquals(44,pizzaOrder.getOrderPrice());

    }
}
