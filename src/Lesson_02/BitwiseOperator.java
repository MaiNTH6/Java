package Lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if(firstMethod() & secondMethod()){

        }

    }
    public static boolean firstMethod(){
        System.out.println("firstMethod");
        return true;
    }
    public static boolean secondMethod(){
        System.out.println("secondMethod");
        return false;
    }
    //&&:
      //TT: ra 2 ket qua
      //TF: ra 2 ket qua
      //Ft: ra 1 ket qua dau
    // &: Luon tra 2 ket qua
    // ||: chi can 1 ket qua dung la dung het
}
