package Lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        System.out.println("randomNumber: " + randomNumber);

        do{
            //Guessing number
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your guessing number: ");
            int userInput = scanner.nextInt();
            if(userInput == randomNumber){
                System.out.println("Hooray! It's correct!");
                break;
            }
            guessingTime++;

        }while (guessingTime<3);
        System.out.println("See you again!");
    }
}
