package Lesson_04;

import java.security.SecureRandom;

public class Function2 {

    public static void main(String[] args) {
        System.out.println(getArandomNumber(2));
        System.out.println(getArandomNumber(10));

    }

    public static int getArandomNumber(int boundary){
        int randomNumber = new SecureRandom().nextInt(Integer.MAX_VALUE);
        return randomNumber;
    }

    }

