import java.util.Scanner;

public class DrinksAndCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            Drinks.displayMenu();
            System.out.println("Choose a drink by entering its number: ");
            int choice = scanner.nextInt();
            if (choice == 7)
                break;
            Drinks.orderDrink(choice);



        }
        System.out.println("Total Drinks: " + Drinks.totalDrinks);
        System.out.println("Total Cost: $" + Drinks.totalCost);




    }
}