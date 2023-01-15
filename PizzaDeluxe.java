public class PizzaDeluxe extends Pizza {
    public PizzaDeluxe(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
