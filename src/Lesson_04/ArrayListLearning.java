package Lesson_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        //ArrayList<Integer> myArrayList = new ArrayList<>(); ArrayList chi la 1 dang cua List
        List<Integer> myArrayList = new ArrayList<>();
        // CRUD
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(0, 3);
        for (int index = 0; index < myArrayList.size(); index++) {
            myArrayList.get(index);
            System.out.println(myArrayList.get(index));

        }
        for(int integer : myArrayList){
            System.out.println(integer);
        }
//        myArrayList.add(false);
//        myArrayList.add("Teo");
//        myArrayList.add("1.8f"); //1.8d, 180l
    }
}
