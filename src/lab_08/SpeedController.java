package lab_08;

import lab_07_2.Animals;

import java.util.ArrayList;
import java.util.List;

public class SpeedController {
    // Loc ra nhung con khong biet bay
    public Animal getFlyable(List<Animal> animalList) {
        Animal animalWinner = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if ((animalList.get(i).isFlyable()) == false) {
                if (animalWinner.getSpeed() < animalList.get(i).getSpeed()) {
                    animalWinner = animalList.get(i);
                }

            }

        }
       return animalWinner;
    }
}


