package lab_07_1;

public class FTE extends Employee {

    private static int FTE_SALARY = 5000;
    public FTE(String name) {
        super(name, FTE_SALARY);
    }

    @Override
    public int getSalary() {
        return FTE_SALARY;
    }
}
