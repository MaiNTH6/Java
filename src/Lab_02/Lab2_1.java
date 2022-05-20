package Lab_02;
import java.util.Scanner;
public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height: ");
        Float inputHeight = scanner.nextFloat();

        System.out.println("Please enter weight: ");
        float inputWeight = scanner.nextFloat();

        Float BMI = inputWeight / (inputHeight * 2);

        System.out.printf("Your height is: %fm\n" , inputHeight );
        System.out.printf("Your weight is: %fkg\n" , inputWeight);
        System.out.printf("Your BMI is: %f   " , BMI);

        if(BMI <= 18.5){
            System.out.println("Underweight");
        }else if(BMI <= 24.9){
            System.out.println("Normal weight");
        }else if(BMI >= 25 && BMI <=29.9){
            System.out.println("Overweight");
        }else {
            System.out.println("Obesity");
        }

    }
}
