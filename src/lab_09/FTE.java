package lab_09;

public abstract class FTE extends Employee{
    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 5000;
    }
}
