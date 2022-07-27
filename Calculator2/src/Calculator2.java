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
            System.out.println(operation);
            switch (operation) {
                case "+", "-", "*", "/", "%" -> System.out.println("User inputs supported operations");
                default -> System.out.println("User inputs unsupported operations (should be: +, -, *, /, %)");
            }

            System.out.println("Enter the second number");
            if (sc.hasNextDouble()) {
                double secondValue = sc.nextDouble();
                System.out.println("Input is correct");

                switch (operation) {
                    case "+" -> {
                        double result1 = firstValue + secondValue;
                        System.out.println("Result is: " + result1);
                    }
                    case "-" -> {
                        double result2 = firstValue - secondValue;
                        System.out.println("Result is: " + result2);
                    }
                    case "/" -> {
                        double result3 = firstValue / secondValue;
                        System.out.println("Result is: " + result3);
                    }
                    case "*" -> {
                        double result4 = firstValue * secondValue;
                        System.out.println("Result is: " + result4);
                    }
                    case "%" -> {
                        double result5 = firstValue % secondValue;
                        System.out.println("Result is: " + result5);
                    }
                    default -> System.out.println("Something is wrong");
                }
            } else {
                System.out.println("Input is wrong (should be a number)");
            }
        } else {
            System.out.println("Input is wrong (should be a number)");
        }
    }

}
