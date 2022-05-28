package Lesson_04;

public class Function1 {
    public static void main(String[] args) {
        // Parameter(s) vs argument(s)
       getArandomNumber("Teo"); // "Teo": argument
       getArandomNumber("To");
       getArandomNumber("Te");
    }
    public static void getArandomNumber(String name){
        // void: khong tra ve gia tri j
        // name: parameter
        // varargs, rest parameters
        System.out.println("Hello" + name);
    }

    }

