package Lesson_02;

import java.util.Scanner;

public class IfTernaryOperater {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time(hr): ");
        int arrivalTime = scanner.nextInt();
        //boolean isHeOnTime = arrivalTime ==7;
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        // Ternary operater: Toan tu 3 ngoi

        String outputMsg = isHeOnTime ? "Let's talk!" : "write a letter";
        System.out.println(outputMsg);


        System.out.println("Going home");
    }
}
