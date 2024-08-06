import java.util.Scanner;

public class third {
    // Method to calculate the ASCII value sum of a string
    public static int calculateAsciiValue(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += (int) input.charAt(i);
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ASCII Payment System!");
        
        // Get the product or identifier from the user
        System.out.print("Enter the product name or identifier: ");
        String product = scanner.nextLine();
        
        // Calculate the ASCII value
        int paymentAmount = calculateAsciiValue(product);
        
        // Display the payment amount
        System.out.println("The ASCII payment amount for \"" + product + "\" is: " + paymentAmount);

        // Close the scanner
        scanner.close();
    }
}
