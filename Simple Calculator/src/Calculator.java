import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");

        if (sc.hasNextDouble()) {
            double firstValue = sc.nextDouble();
            System.out.println("Input is correct: " + firstValue);

            System.out.println("Enter an operation (for example: +, -, *, /, %)");
            String operation = sc.next();
            System.out.println(operation);
            if (operation.equals("+") |
                    operation.equals("-") |
                    operation.equals("*") |
                    operation.equals("/") |
                    operation.equals("%") ) {
                System.out.println("User inputs supported operations");

                System.out.println("Enter the second number");
                if (sc.hasNextDouble()) {
                    double secondValue = sc.nextDouble();
                    System.out.println("Input is correct: " + secondValue);
                    if (operation.equals("+")) {
                        double result = firstValue + secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    } else if (operation.equals("-")) {
                        double result = firstValue - secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    } else if (operation.equals("*")) {
                        double result = firstValue * secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    } else if (operation.equals("/")) {
                        double result = firstValue / secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    } else if (operation.equals("%")) {
                        double result = firstValue % secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    }

                } else {
                    System.out.println("Input is wrong (should be a number)");
                }
            } else {
                System.out.println("User inputs unsupported operations");
            }
        } else {
            System.out.println("Input is wrong (should be a number)");
        }
    }
}
