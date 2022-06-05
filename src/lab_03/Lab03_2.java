package lab_03;

public class Lab03_2 {

    public static void main(String[] args) {

        int[] intArray = {11, 2, 3, 4, 5};
        int arrayLength = intArray.length;

        int maxArray = intArray[0];
        int minArray = intArray[0];

        for (int i = 0; i < arrayLength; i++) {
            if (maxArray < intArray[i]) {
                maxArray = intArray[i];
            }
            if (minArray > intArray[i]) {
                minArray = intArray[i];
            }
        }

        System.out.printf("Phan tu mang co gia tri lon nhat: %d\n", maxArray);
        System.out.printf("Phan tu mang co gia tri nho nhat: %d\n", minArray);
    }
}
