enum DrinksMachine {
    COFFEE, TEA, LEMONADE, MOJITO, SODA, COCA_COLA
}
class Drinks {
    static final double COFFEE_PRICE = 2.2;
    static final double TEA_PRICE = 1.5;
    static final double LEMONADE_PRICE = 3.1;
    static final double MOJITO_PRICE = 4.1;
    static final double SODA_PRICE = 2.0;
    static final double COCA_COLA_PRICE = 2.6;

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

    static void prepareCocaCola() {
        System.out.println("Preparing Coca Cola");
        totalDrinks++;
        totalCost += COCA_COLA_PRICE;
    }
}
