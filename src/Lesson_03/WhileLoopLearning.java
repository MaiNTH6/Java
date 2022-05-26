package Lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {

        // Su dung khi khong biet so vong lap la bao nhieu
        /*
        * ===========Game Menu =============
        * 1. Generate random ni=umber (less then 1000)
        * 0. Exit!
        *
        * */
        boolean isContinuing = true;
        while ((isContinuing)){
            isContinuing = false;
            System.out.println("===========Game Menu =============");
            System.out.println("1. Generate random ni=umber (less then 1000)");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select option: ");
            int option = scanner.nextInt();

            if(option ==0){
                isContinuing = false;
            }else if (option ==1){
                System.out.println("Your random number: " + new SecureRandom().nextInt(1000));
            }else {
                System.out.println("ERR Input khong hop le");
            }

        }
    }
}
