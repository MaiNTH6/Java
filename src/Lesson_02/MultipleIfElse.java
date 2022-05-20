package Lesson_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        // <18 || 18-55 || >56
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int clientAge = scanner.nextInt();
        if(clientAge < 18){
            if(clientAge < 14){
                System.out.println("calling 911 .....");
            }
            System.out.println("Khong ban !");
        //}else if (clientAge >=18 && clientAge <=55){      Cach1: day du nhung bi du thua
        }else if (clientAge <=55){                       // Cach2: Nen viet theo cach 2 toi uu hon
            System.out.println("UnLimited");
        }else {
            System.out.println("2 chai");
        }
    // || hoac hoac
    // &  bitwise
        //4 | 5: ra 5
        //4 & 5: ra 4
            //100
            //101
            //100


    }
}
