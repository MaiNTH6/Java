package lab_07_2;

import java.util.List;

public class SpeedController {

    public Animals getMaxSpeed(List<Animals> animalsList){

        Animals animalWinner = animalsList.get(0);
        for (int i = 1; i < animalsList.size(); i++) {
            if(animalWinner.getSpeed() < animalsList.get(i).getSpeed()) {
                animalWinner = animalsList.get(i);
            }

        }

        return animalWinner;
    }
}
