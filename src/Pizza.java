import java.util.ArrayList;

public class Pizza {
    private int price;
    private PizzaType pizzaType;

    
    private static final int EXTRA_CHEESE_PRICE = 200;
    private static final int EXTRA_TOPPINGS_PRICE = 300;
    private static final int PACKAGING_PRICE = 100;

   
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeawayOpted = false;

    private ArrayList<String> billDetails = new ArrayList<>();

    
    public enum PizzaType {
        CHICKEN("Chicken Pizza", 1500),
        CHEESE("Cheese Pizza", 1200),
        VEGETABLE("Vegetable Pizza", 1000),
        NON_VEGETABLE("Non-Vegetable Pizza", 1300);

        private String name;
        private int basePrice;

        PizzaType(String name, int basePrice) {
            this.name = name;
            this.basePrice = basePrice;
        }

        public String getName() {
            return name;
        }

        public int getBasePrice() {
            return basePrice;
        }
    }

  
    public Pizza(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
        this.price = pizzaType.getBasePrice();
        billDetails.add(pizzaType.getName() + ": " + this.price);
    }

    
    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.price += EXTRA_CHEESE_PRICE;
            extraCheeseAdded = true;
            billDetails.add("Extra Cheese: " + EXTRA_CHEESE_PRICE);
            System.out.println("Extra cheese added.");
        } else {
            System.out.println("Extra cheese already added.");
        }
    }

   
    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            this.price += EXTRA_TOPPINGS_PRICE;
            extraToppingsAdded = true;
            billDetails.add("Extra Toppings: " + EXTRA_TOPPINGS_PRICE);
            System.out.println("Extra toppings added.");
        } else {
            System.out.println("Extra toppings already added.");
        }
    }

    
    public void optForTakeaway() {
        if (!takeawayOpted) {
            this.price += PACKAGING_PRICE;
            takeawayOpted = true;
            billDetails.add("Takeaway Packaging: " + PACKAGING_PRICE);
            System.out.println("Takeaway packaging added.");
        } else {
            System.out.println("Takeaway packaging already opted.");
        }
    }

    
    public void getBill() {
        System.out.println("\n---- Final Bill ----");
        for (String item : billDetails) {
            System.out.println(item);
        }
        System.out.println("Total Price: " + this.price);
        System.out.println("--------------------");
    }
}
