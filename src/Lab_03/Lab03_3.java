package Lab_03;

import java.util.Arrays;

public class Lab03_3 {

    public static void main(String[] args) {
        int[] intArray = {5, 1, 0, 15, 10, 8};
        int arrayLength = intArray.length;

        int numArray = intArray[0];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (intArray[i] > intArray[j]) {
                    int tg = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tg;


                }
            }

        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(intArray[i] + " ");
        }


    }
}
