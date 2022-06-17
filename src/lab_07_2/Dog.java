package lab_07_2;

public class Dog extends Animals{

    private static int DOG_MAX_SPEED = 75;

    public Dog(String name, int maxSpeed) {
        super(name, DOG_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return DOG_MAX_SPEED;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
