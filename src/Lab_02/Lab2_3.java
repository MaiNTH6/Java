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
        Float weightMin = 18.5f * (inputHeight *2);
        Float weightMax = 24.9f * (inputHeight *2);



//        System.out.printf("Your height is: %fm\n" , inputHeight );
//        System.out.printf("Your weight is: %fkg\n" , inputWeight);
        System.out.printf("Your BMI is: %f\n", BMI);
        System.out.printf("weightMin: %fkg\n", weightMin);
        System.out.printf("weightMax: %fkg\n", weightMax);

        if(inputWeight < weightMin){
            System.out.printf("Ban can Tang: %fkg", weightMin - inputWeight);
        }else {
            System.out.printf("Ban can Giam: %fkg",inputWeight - weightMax);
        }

    }
}
