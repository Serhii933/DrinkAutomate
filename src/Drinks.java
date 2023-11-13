
import java.util.Scanner;

public class Drinks {
    static final double COFFEE_PRICE = 2.2;
    static final double TEA_PRICE = 1.5;
    static final double LEMONADE_PRICE = 3.1;
    static final double MOJITO_PRICE = 4.1;
    static final double SODA_PRICE = 2.0;
    static final double COCA_COLA_PRICE = 2.2;

    static int totalDrinks = 0;
    static double totalCost = 0.0;

    static void prepareCoffee() {
        System.out.println("Preparing Coffee");
        totalDrinks++;
        totalCost += COFFEE_PRICE;
    }

    static void prepareTea() {
        System.out.println("Preparing Tea");
        totalDrinks++;
        totalCost += TEA_PRICE;
    }

    static void prepareLemonade() {
        System.out.println("Preparing Lemonade");
        totalDrinks++;
        totalCost += LEMONADE_PRICE;
    }

    static void prepareMojito() {
        System.out.println("Preparing Mojito");
        totalDrinks++;
        totalCost += MOJITO_PRICE;

    }

    static void prepareSoda() {
        System.out.println("Preparing Soda");
        totalDrinks++;
        totalCost += SODA_PRICE;
    }

    static void prepareCoca_Cola() {
        System.out.println("Preparing Coca_Cola");
        totalDrinks++;
        totalCost += COCA_COLA_PRICE;
    }


    static void orderDrink(int choice) {

        switch (choice) {
            case 1:
                prepareCoffee();
                break;
            case 2:
                prepareTea();
                break;
            case 3:
                prepareLemonade();
                break;
            case 4:
                prepareMojito();
                break;
            case 5:
                prepareSoda();
                break;
            case 6:
                prepareCoca_Cola();
                break;


            default:
                System.out.println("Invalid choice");
        }
    }

    static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Coffee - $" + COFFEE_PRICE);
        System.out.println("2. Tea - $" + TEA_PRICE);
        System.out.println("3. Lemonade - $" + LEMONADE_PRICE);
        System.out.println("4. Mojito - $" + MOJITO_PRICE);
        System.out.println("5. Soda - $" + SODA_PRICE);
        System.out.println("6. Coca Cola - $" + COCA_COLA_PRICE);
        System.out.println("7. Exit");
    }

}

