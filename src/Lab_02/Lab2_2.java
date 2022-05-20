package Lab_02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int myNumber = scanner.nextInt();

        if(myNumber%2 == 0){
            System.out.println("This is an even number");
        }else{
            System.out.println("This is an odd number");
        }

    }
}
