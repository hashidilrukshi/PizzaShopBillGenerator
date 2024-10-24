import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your pizza type:");
        System.out.println("1. Chicken Pizza");
        System.out.println("2. Cheese Pizza");
        System.out.println("3. Vegetable Pizza");
        System.out.println("4. Non-Vegetable Pizza");
        int choice = scanner.nextInt();

        Pizza.PizzaType selectedPizzaType = null;

        switch (choice) {
            case 1:
                selectedPizzaType = Pizza.PizzaType.CHICKEN;
                break;
            case 2:
                selectedPizzaType = Pizza.PizzaType.CHEESE;
                break;
            case 3:
                selectedPizzaType = Pizza.PizzaType.VEGETABLE;
                break;
            case 4:
                selectedPizzaType = Pizza.PizzaType.NON_VEGETABLE;
                break;
            default:
                System.out.println("Invalid selection. Please choose a valid option.");
                return;
        }

        
        Pizza pizza = new Pizza(selectedPizzaType);

        
        System.out.println("Would you like to add extra cheese? (yes/no)");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.addExtraCheese();
        }

        System.out.println("Would you like to add extra toppings? (yes/no)");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.addExtraToppings();
        }

        System.out.println("Would you like takeaway packaging? (yes/no)");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.optForTakeaway();
        }

       
        pizza.getBill();
    }
}
