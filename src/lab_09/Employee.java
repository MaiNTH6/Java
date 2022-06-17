package lab_09;

public abstract class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }
    public abstract int getSalary();
}
