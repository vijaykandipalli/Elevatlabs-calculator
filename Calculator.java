import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }
    public static double mult(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to the Java Console Calculator!");

        while (keepRunning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = sub(num1, num2);
                    break;
                case 3:
                    result = mult(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}