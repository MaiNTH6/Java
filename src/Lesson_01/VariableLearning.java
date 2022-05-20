package Lesson_01;

public class VariableLearning {
    public static void main(String[] args) {
        // Khai báo biến
        byte myByteNumber = 1;
        short myShortNumber = 128;
        int myIntegerNumber = 129;
        float myFloatNumber = 2.7f;
        long myLongNumber = 456254L;
        double myDoubleNumber = 2.1D;

        boolean myBVar = true;
        myBVar = false;

        char c ='d';


        // In
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(myByteNumber);
    }
}
//Big Number: thường dùng trong ngân hàng - tài chính
//Đặt tên biến: Snake_case, camelCase, PascalCase
    //SnakeCase: my_byte_number (Python)
    //CamelCase: Bắt đầu bằng chữ thường_Chữ hoa_Chữ Hoa: myIntegerNumber
    //PascalCase: Bắt đầu bằng chữ hoa_chữ Hoa
//Tên biến: đặc tả có ý nghĩa