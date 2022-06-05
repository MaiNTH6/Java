package lab_06;

import java.util.Scanner;

//String myPassword = "password123";
//Allow user to input maximum 3 times
public class Lab06_2 {
    public static void main(String[] args) {

        String myPassword = "password123";
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input Password: ");
            String InputPassword = scanner.nextLine();

            if (InputPassword.equals("password123")) {
                System.out.println("Ban da nhap dung PW");
                break;
            } else {
                System.out.println("Ban da nhap sai. Hay nhap lai");

            }
        }
    }
}
