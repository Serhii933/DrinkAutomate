public class DrinksAndCosts {
    public static void main(String[] args) {

        String userChoice = "Tea";

        DrinksMachine selectedDrink = DrinksMachine.valueOf(userChoice.toUpperCase());

        switch (selectedDrink) {
            case COFFEE:
                Drinks.prepareCoffee();
                break;
            case TEA:
                Drinks.prepareTea();
                break;
            case LEMONADE:
                Drinks.prepareLemonade();
                break;
            case MOJITO:
                Drinks.prepareMojito();
                break;
            case SODA:
                Drinks.prepareSoda();
                break;
            case COCA_COLA:
                Drinks.prepareCocaCola();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


        userChoice = "Coffee";
        selectedDrink = DrinksMachine.valueOf(userChoice.toUpperCase());
        switch (selectedDrink) {
            case COFFEE:
                Drinks.prepareCoffee();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }


        System.out.println("Total Drinks: " + Drinks.totalDrinks);
        System.out.println("Total Cost: $" + Drinks.totalCost);
    }
}