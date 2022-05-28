package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04_1 {


    public static void main(String[] args) {
        boolean isContinuing = true;
        while ((isContinuing)) {
            printSimpleMenu();
            int option = getUseroption();
            switch (option) {
                case 1:
                    System.out.println("1. Add number into ArrayList");
                    break;
                case 2:
                    System.out.println("2. Print number: ");
                    break;
                case 3:
                    System.out.println("3. Get maximun number");
                    break;
                case 4:
                    System.out.println("4. Get minimun number");
                    break;
                case 5:
                    System.out.println("5. Search number");
                    break;
                default:  // Ngoai nhung truong hop tren
                    System.out.println("ERR Input khong hop le");

            }
            arrayList();

        }

    }

    private static void arrayList() {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
        myArrayList.add(21);
        myArrayList.add(25);
        myArrayList.add(0, 23);
        myArrayList.add(28);
        myArrayList.add(5);
        for (int index = 0; index < myArrayList.size(); index++) {
            myArrayList.get(index);
            System.out.println(myArrayList.get(index));
        }
        //
        int maxArray;
        int minArray;
        maxArray = myArrayList.get(0);
        minArray = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) > maxArray) {
                maxArray = myArrayList.get(i);
            }
            if (myArrayList.get(i) < minArray) {
                minArray = myArrayList.get(i);
            }

        }
        System.out.println("MaxArray: " + maxArray);
        System.out.println("MinArray: " + minArray);

        int viTri5 = myArrayList.get(0);
        for (int index = 0; index < myArrayList.size(); index++) {
            if (myArrayList.contains(5)) {
                viTri5 = myArrayList.get(index);

            } else {
                System.out.println("Khong co phan tu so 5 trong mang");
            }
        }
        System.out.printf("So 5 o vi tri thu: %d trong mang:", viTri5);
    }

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
        System.out.println("5. Search number");
    }

}


