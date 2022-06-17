package lab_07_2;

import java.util.List;

public class SpeedController {

    public Animals getMaxSpeed(List<Animals> animalsList){

        Animals maxSpeed = animalsList.get(0);
        for (int i = 0; i < animalsList.size(); i++) {
            if(maxSpeed.getSpeed() < animalsList.get(i).getSpeed()) {
                maxSpeed = animalsList.get(i);
            }

        }
        return maxSpeed;
    }
}
