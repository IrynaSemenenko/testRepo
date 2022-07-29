import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        if (sc.hasNextDouble()) {
            double firstValue = sc.nextDouble();
            System.out.println("Input is correct");
            System.out.println("Enter an operation (for example: +, -, *, /, %)");
            String operation = sc.next();
            if (operation.equals("+") |
                    operation.equals("-") |
                    operation.equals("*") |
                    operation.equals("/") |
                    operation.equals("%")) {
                System.out.println("User inputs supported operations");
                System.out.println("Enter the second number");
                if (sc.hasNextDouble()) {
                    double secondValue = sc.nextDouble();
                    System.out.println("Input is correct");
                    switch (operation) {
                        case "+" -> {
                            double result = firstValue + secondValue;
                            System.out.println("Result is: " + result);
                        }
                        case "-" -> {
                            double result = firstValue - secondValue;
                            System.out.println("Result is: " + result);
                        }
                        case "/" -> {
                            if (secondValue == 0) {
                                System.out.println("Division by '0' is impossible. Try to select another operation or enter other data");
                            }
                            double result = firstValue / secondValue;
                            System.out.println("Result is: " + result);
                        }
                        case "*" -> {
                            double result = firstValue * secondValue;
                            System.out.println("Result is: " + result);
                        }
                        case "%" -> {
                            double result = firstValue % secondValue;
                            System.out.println("Result is: " + result);
                        }
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
