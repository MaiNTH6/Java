package lab_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestRacingAnimal {

    public static void main(String[] args) {

        Animal.Builder animalBuilder = new Animal.Builder();
        //Add Eagle
        animalBuilder.setName("Eagle");
        animalBuilder.setSpeed(new SecureRandom().nextInt(100));
        animalBuilder.setFlyable(true);
        Animal Eagle = animalBuilder.build();

        // Add Falcon
        animalBuilder.setName("Falcon");
        animalBuilder.setSpeed(new SecureRandom().nextInt(100));
        animalBuilder.setFlyable(true);
        Animal Falcon = animalBuilder.build();

        // Add Tiger
        animalBuilder.setName("Tiger");
        animalBuilder.setSpeed(new SecureRandom().nextInt(100));
        animalBuilder.setFlyable(false);
        Animal Tiger = animalBuilder.build();

        // Add Snake
        animalBuilder.setName("Snake");
        animalBuilder.setSpeed(new SecureRandom().nextInt(100));
        animalBuilder.setFlyable(false);
        Animal Snake = animalBuilder.build();


        SpeedController speedController = new SpeedController();
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        animalArrayList.add(Eagle);
        animalArrayList.add(Falcon);
        animalArrayList.add(Tiger);
        animalArrayList.add(Snake);
        System.out.println(animalArrayList);

      System.out.println(speedController.getFlyable(animalArrayList));


    }
}
