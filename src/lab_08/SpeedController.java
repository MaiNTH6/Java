package lab_08;

import lab_07_2.Animals;

import java.util.ArrayList;
import java.util.List;

public class SpeedController {
    // Loc ra nhung con biet bay
    public Animal getFlyable(List<Animal> animalList) {
        Animal maxSpeed = animalList.get(0);
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).isFlyable()) {
//                maxSpeed = animalList.get(0);
                if (maxSpeed.getSpeed() < animalList.get(i).getSpeed()) {
                    maxSpeed = animalList.get(i);
                }
//                return maxSpeed;
            }


        }
        return maxSpeed;
    }
}


