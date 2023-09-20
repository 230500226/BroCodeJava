package HelloWorld;
import java.util.Scanner;
class SimpleCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            int product = num1 * num2;
            int difference = num1 - num2;
            double quotient = (double) num1 / num2;
            int remainder = num1 % num2;

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("ifference: " + difference);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
            System.out.println("Sum: " + sum);
        scanner.close();
    }

    static void hello (String name) {
        System.out.println("Hello " +name);
    }
}
