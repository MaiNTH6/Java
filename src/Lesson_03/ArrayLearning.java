package Lesson_03;

public class ArrayLearning {

    public static void main(String[] args) {
        //int[] myIntArray = {1,2,3,4,5};
        //int arrayLength = myIntArray.length;
        int arraylength = 5;
        int [] myInArray = new int[5];

        for (int index = 0; index < arraylength; index++) {
            myInArray[index] = index +1;    // not index++
        }
//        myInArray[0] = 1;
//        myInArray[1] = 2;
//        myInArray[2] = 3;
//        myInArray[3] = 4;
//        myInArray[4] = 5;
        for (int index = 0; index < arraylength; index++) {
            System.out.printf("Element at the index %d has value %d\n", index, myInArray[index]);
           //System.out.println(myInArray[index]);

        }
        // Enhanced for loop - khi khong can thay doi - chi can lay gai tri
//        for (int i : myIntArray) {
//            System.out.println(i);

        }

        }




