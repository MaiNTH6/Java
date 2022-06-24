package lab_07_2;

import java.util.ArrayList;

public class TestSpeed {

    public static void main(String[] args) {

        SpeedController speedController = new SpeedController();
        Dog dog = new Dog("Dog", 75);
        Horse horse = new Horse("Horse", 75);
        Tiger tiger = new Tiger("Tiger", 75);

        ArrayList<Animals> animalsArrayList = new ArrayList<>();
        animalsArrayList.add(dog);
        animalsArrayList.add(horse);
        animalsArrayList.add(tiger);

        System.out.println(animalsArrayList);
        System.out.println(speedController.getMaxSpeed(animalsArrayList));


    }

}
