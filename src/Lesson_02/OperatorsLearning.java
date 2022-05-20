package Lesson_02;


public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        int total = myNum1 + myNum2;
        int multiple = myNum1 * myNum2;
        int x = ++myNum1 + myNum2++;
        /*
        * Prefix First > right oprerand > assign value to left operand > postfix
        * myNum1 = 2
        * myNum2 = 3
        * x = 2 + 2 = 4 (Cong de tinh x truoc roi tang myNum2 sau)
        * */

        System.out.println("Total: " + total);
        // Chia lay phan nguyen
        System.out.println(5/2);
        // Chia lay phan du
        System.out.println(5%2);
        // In tren 1 dong
        System.out.print(x + "\n");
        // In ngat dong
        System.out.println(x);
        /*
        *In theo format (
        * %d: la cho so nguyen,
        * %f: la cho so thuc,
        * %s: chuoi,
        * %b: la boolean)
        * \t: Lui vao 1 dong
        * \n: xuong dong
        **/
        System.out.printf("\t\t%d + %d = %d\n", 1, 2, 3);

    }
}
