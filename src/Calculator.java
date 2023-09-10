import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operation;
        double num1, num2, solution;
        System.out.println("CALCULATOR");
        do {
            System.out.println("Menu:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Exit");
            System.out.print("Choose your Operation: ");
            operation = input.nextInt();

            switch (operation) {
                case 1 -> {
                    System.out.println("Enter the Numbers:");
                    System.out.print("Num 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Num 2: ");
                    num2 = input.nextDouble();
                    solution = num1 + num2;
                    System.out.println("Result: " + solution);
                }
                case 2 -> {
                    System.out.println("Enter the Numbers:");
                    System.out.print("Num 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Num 2: ");
                    num2 = input.nextDouble();
                    solution = num1 - num2;
                    System.out.println("Result: " + solution);
                }
                case 3 -> {
                    System.out.println("Enter the Numbers:");
                    System.out.print("Num 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Num 2: ");
                    num2 = input.nextDouble();
                    solution = num1 * num2;
                    System.out.println("Result: " + solution);
                }
                case 4 -> {
                    System.out.println("Enter the Numbers:");
                    System.out.print("Num 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Num 2: ");
                    num2 = input.nextDouble();
                    solution = num1 / num2;
                    System.out.println("Result: " + solution);
                }
                case 5 -> System.out.println("Exiting Program");
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
        while (operation != 5);
        input.close();
    }
}