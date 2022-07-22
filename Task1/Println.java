import java.util.Scanner;

    public class Println {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello. What is your name?");
            String name = sc.nextLine();
            System.out.println(name);
            System.out.println("Where are you live, " + name + "?");
            String city = sc.nextLine();
            System.out.println(city);
            System.out.println("Hello, " + name + " from " + city);
        }
    }

