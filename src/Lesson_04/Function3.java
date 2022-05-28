package Lesson_04;

import java.security.SecureRandom;

public class Function3 {
    public static void main(String[] args) {
        printNumber();;
        System.out.println("fhdks");

    }

    public static int getArandomNumber(int boundary) {
        int randomNumber = new SecureRandom().nextInt(Integer.MAX_VALUE);
        return randomNumber;
    }

    public static void printNumber() {
        // Ten function thuong bat dau bang chu thuong, va la dong tu
        // Dac ta duoc function do lam cai j
        for (int index = 0; index < 10; index++) {
            if(index ==8){
                System.out.println("You have reaches the magic number ..");
                return;
            }
            else System.out.println(index);

        }
        System.out.println("End the program");
    }
}
//DRY: Don't Repeat Yourself
//SOLID:
//S: Single Responsibility

