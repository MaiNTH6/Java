package Lab_02;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height: ");
        Float inputHeight = scanner.nextFloat();

        System.out.println("Please enter weight: ");
        float inputWeight = scanner.nextFloat();

        Float BMI = inputWeight / (inputHeight * 2);
        Float WeightMin = 18.5f * (inputHeight *2);
        Float WeightMax = 24.9f * (inputHeight *2);


//        System.out.printf("Your height is: %fm\n" , inputHeight );
//        System.out.printf("Your weight is: %fkg\n" , inputWeight);
        System.out.printf("Your BMI is: %f\n", BMI);
        System.out.printf("WeightMin: %fkg\n", WeightMin);
        System.out.printf("WeightMax: %fkg\n", WeightMax);

        if(inputWeight < WeightMin){
            System.out.printf("Ban can Tang: %fkg", WeightMin - inputWeight);
        }else {
            System.out.printf("Ban can Giam: %fkg",inputWeight - WeightMax);
        }

    }
}
