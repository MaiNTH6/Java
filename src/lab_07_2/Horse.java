package lab_07_2;

public class Horse extends Animals{

    private static int HORSE_MAX_SPEED = 75;

    public Horse(String name, int maxSpeed) {
        super(name, HORSE_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return HORSE_MAX_SPEED;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
