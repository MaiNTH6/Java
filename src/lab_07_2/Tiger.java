package lab_07_2;

public class Tiger extends Animals{

    private static int TIGER_MAX_SPEED = 75;

    public Tiger(String name, int maxSpeed) {
        super(name, TIGER_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return TIGER_MAX_SPEED;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
