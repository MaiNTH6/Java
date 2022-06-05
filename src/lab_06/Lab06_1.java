package lab_06;
//Given input string: "2hrs and 5 minutes"
//Please calculate how many minutes in total

import java.util.Arrays;
import java.util.Scanner;

public class Lab06_1 {

    public static void main(String[] args) {

        // Input String
        String inputStr = "2hrs and 5 minutes";
        System.out.println("My String: " + inputStr);
        // Convert to array
        String[] splitStr = inputStr.split(" ");
        System.out.println(Arrays.toString(splitStr));

        //int totalMinute = 0;
        for (int i = 0; i < splitStr.length; i++) {
            if(splitStr[i].contains("2hrs")){
                System.out.println("Total Minute: " + (2*60 + 5));

            }


        }

    }

}

