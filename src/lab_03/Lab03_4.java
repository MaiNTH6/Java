package lab_03;

public class Lab03_4 {

    public static void main(String[] args) {

        int[] myArray1 = {1, 11, 6, 15, 19, 8};
        int[] myArray2 = {3, 9, 1, 7, 16, 14};

        // Cong mang
        int lengthArray = myArray1.length + myArray2.length;
        int[] mergeArray = new int[lengthArray];
        int i = 0;
        for (int ArrayElement : myArray1) {
            mergeArray[i] = ArrayElement;
            i++;
        }
        for (int ArrayElement : myArray2) {
            mergeArray[i] = ArrayElement;
            i++;
        }

        // Sap xep tang dan
        for (int j = 0; j < lengthArray; j++) {
            for (int k = 0; k < lengthArray; k++) {
                if (mergeArray[j] < mergeArray[k]) {
                    int tg = mergeArray[j];
                    mergeArray[j] = mergeArray[k];
                    mergeArray[k] = tg;
                }

            }

        }
        for (int j = 0; j < lengthArray; j++) {
            System.out.print(mergeArray[j] + " ");

        }


    }
}
