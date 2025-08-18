package CT1_Practice.Fall23;

public class PizzaShop {
    // Prices for different items in the shop
    private int pizza_price = 320;
    private int drink_price = 40;
    private int fries_price = 100;

    // Constructor: runs once when a PizzaShop object is created
    // Prints a welcome message to the customer
    PizzaShop() {
        System.out.println("Welcome to pizza shop");
    }

    // Method to place an order with pizzas and drinks
    // Calculates and prints the total bill
    public void order(int pizzas, int drinks) {
        System.out.println("You ordered " + pizzas + " pizzas, " + drinks + " drinks");
        int total = pizzas * pizza_price + drinks * drink_price;
        System.out.println("Total bill: " + total + " taka");
    }

    // Method to place an order with pizzas, drinks, and fries
    // Calculates and prints the total bill
    public void order(int pizzas, int drinks, int fries) {
        System.out.println("You ordered " + pizzas + " pizzas, " + drinks + " drinks, " + fries + " fries");
        int total = pizzas * pizza_price + drinks * drink_price + fries * fries_price;
        System.out.println("Total bill: " + total + " taka");
    }

    // Method to place an order with only pizzas
    // Calculates and prints the total bill
    public void order(int pizzas) {
        System.out.println("You ordered " + pizzas + " pizzas");
        int total = pizzas * pizza_price;
        System.out.println("Total bill: " + total + " taka");
    }
}
