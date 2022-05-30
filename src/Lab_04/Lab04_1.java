package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04_1 {

    private static int getUseroption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select option: ");
        int option = scanner.nextInt();
        return option;
    }

    private static void printSimpleMenu() {
        System.out.println("===========Menu =============");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print number");
        System.out.println("3. Get maximun number");
        System.out.println("4. Get minimun number");

    }

    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
            printSimpleMenu();
            int option = getUseroption();

            List<Integer> myArrayList = new ArrayList<>();
            myArrayList.add(10);
            myArrayList.add(5);
            myArrayList.add(18);
            myArrayList.add(0, 26);
            myArrayList.add(4);


            switch (option) {
                case 1:
                    System.out.println("1. Add number into ArrayList");
                    myArrayList.add(1, 5);
                    System.out.println("Phan tu them moi: " + myArrayList.get(1));
                    break;
                case 2:
                    System.out.println("2. Print number");

                    int index;
                    for (index = 0; index < myArrayList.size(); index++) {
                        myArrayList.get(index);
                    System.out.println(myArrayList.get(index));
                    }

                    break;
                case 3:
                    System.out.println("3. Get maximun number");
                    int maxArray;
                    maxArray = myArrayList.get(0);
                    for (int i = 0; i < myArrayList.size(); i++) {
                        if (myArrayList.get(i) > maxArray) {
                            maxArray = myArrayList.get(i);
                        }


                    }
                    System.out.println("MaxArray: " + maxArray);
                    break;
                case 4:
                    System.out.println("4. Get minimun number");
                    int minArray;
                    minArray = myArrayList.get(0);
                    for (int i = 0; i < myArrayList.size(); i++) {
                        if (myArrayList.get(i) < minArray) {
                            minArray = myArrayList.get(i);
                        }

                    }
                    System.out.println("MinArray: " + minArray);
                    break;

                default:  // Ngoai nhung truong hop tren
                    System.out.println("Data khong hop le");

            }


        }


    }


}
