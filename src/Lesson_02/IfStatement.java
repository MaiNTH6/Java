package Lesson_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        //Dat const la 1 hang so: co dinh, khong thay doi
        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time(hr): ");
        int arrivalTime = scanner.nextInt();
        //boolean isHeOnTime = arrivalTime ==7;
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

       // boolean isHeOnTime = false;
        System.out.println("1. Going to the shop");
        if (isHeOnTime) {
            System.out.println("Let's talk!");
        } else {
            System.out.println("write a letter");
        }
        // if(!isHeOnTime): Dao nguoc cua (isHeOnTime)

        System.out.println("Going home");
    }
}
