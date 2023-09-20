package HelloWorld;

import java.util.Scanner;

public class Scancan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Im going to scan your input here:");
        String input = scanner.nextLine();

        System.out.println("Enter int only: ");
        int intValue = scanner.nextInt();
        //clear \n in the buffer if necessary with
        scanner.nextLine();
        //now another scan is ready without just scanning the \n from the previous line        

        System.out.println("Here is what I scanned: "+ input);
        System.out.println("Here is what I scanned(int): "+ intValue);

        scanner.close();

    }
}