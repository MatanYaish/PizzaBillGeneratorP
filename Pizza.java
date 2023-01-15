public class Pizza {
    private int price;
    private Boolean veg;

    private int ExtraCheesePrice = 10;
    private int ExtraToppingsPrice = 15;
    private int DeliveryTip = 15;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isDeliveryTip = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 100;
        } else {
            this.price = 70;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        System.out.println("Extra Cheese added");
        this.price += ExtraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        System.out.println("Extra Toppings added");
        this.price += ExtraToppingsPrice;
    }

    public void Delivery() {
        isDeliveryTip = true;
        System.out.println("Delivery Tip");
        this.price += DeliveryTip;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese added: " + ExtraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings added: " + ExtraToppingsPrice + "\n";
        }

        if (isDeliveryTip) {
            bill += "Delivery Tip: " + DeliveryTip + "\n";
        }

        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}
