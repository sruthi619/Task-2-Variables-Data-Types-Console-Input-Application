import java.util.Scanner;

public class CalculatorApp {

    static int staticVar = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Difference: %d%n", diff);
        System.out.printf("Product: %d%n", product);

        if (num2 != 0) {
            double div = (double) num1 / num2;
            System.out.printf("Division: %.2f%n", div);
        } else {
            System.out.println("Division by zero not allowed!");
        }

        sc.close();
    }
}
