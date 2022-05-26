package Lab_03;

import java.util.Scanner;

public class Lab03_1 {

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5, 8, 17};
        int arraylength = myIntArray.length;

        int countEven = 0;
        int countOdd = 0;
        for (int index = 0; index < arraylength; index++) {
            if (myIntArray[index] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.printf("So luong so chan:%d\n", countEven);
        System.out.printf("So luong so le:%d\n", countOdd);

    }
}
