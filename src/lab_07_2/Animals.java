package lab_07_2;

import java.security.SecureRandom;

public class Animals {

    private  String name;
    private  int speed;

    public Animals(String name, int maxSpeed) {
        this.name = name;
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
