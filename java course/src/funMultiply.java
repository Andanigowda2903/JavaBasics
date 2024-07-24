import java.util.Scanner;

public class funMultiply {

    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");

        // Read the user input
        int userInput = scanner.nextInt();

        // Print the table for the user input
        printTable(userInput);

        // Close the Scanner
        scanner.close();
    }
}