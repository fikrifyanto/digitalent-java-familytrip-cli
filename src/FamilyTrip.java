import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Variable */
        double budget;
        int nights;
        double pricePerNight;
        int additionalCostPercentage;

        /* Catch Input */
        System.out.print("Total budget: ");
        budget = Float.parseFloat(scanner.nextLine());
        System.out.print("Number of nights: ");
        nights = Integer.parseInt(scanner.nextLine());
        System.out.print("Price per night: ");
        pricePerNight = Float.parseFloat(scanner.nextLine());
        System.out.print("Percentage for additional costs: ");
        additionalCostPercentage = Integer.parseInt(scanner.nextLine());

        /* Price per night reduce 5% if nights > 7 */
        if (nights > 7) {
            pricePerNight -= (pricePerNight / 100) * 5;
        }

        /* Calculate */
        double totalCost = nights * pricePerNight;
        totalCost += (budget/100) * additionalCostPercentage;

        /* Check total cost enough or not */
        if (totalCost <= budget) {
            double remainingMoney = budget - totalCost;
            System.out.printf("Smiths will be left with %.2f USD after vacation.", remainingMoney);
        } else {
            double moneyNeeded = totalCost - budget;
            System.out.printf("%.2f USD needed.", moneyNeeded);
        }

        scanner.close();
    }
}
