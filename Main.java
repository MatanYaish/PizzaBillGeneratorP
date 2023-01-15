public class Main {
    public static void main(String[] args) {

//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.Delivery();
//        basePizza.getBill();

        PizzaDeluxe pd = new PizzaDeluxe(false);
        pd.addExtraCheese();
        pd.addExtraToppings();
        pd.Delivery();
        pd.getBill();
    }
}
