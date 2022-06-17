package lab_09;

public abstract class Contractor extends Employee{
    public Contractor(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 6000;
    }
}
