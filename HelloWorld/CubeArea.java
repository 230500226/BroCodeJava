package HelloWorld;

import java.util.Scanner;

public class CubeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the side of the cube:");
        double side = scanner.nextDouble();

        double area = 6 * Math.pow(side, 2);

        System.out.println("The area of the cube is: " + area);
        
        scanner.close();
    }
}
