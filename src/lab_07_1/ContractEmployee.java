package lab_07_1;

public class ContractEmployee extends Employee{

    private  static int CONTRACT_SALARY = 6000;

    public ContractEmployee(String name) {
        super(name, CONTRACT_SALARY);
    }

    @Override
    public int getSalary() {
        return CONTRACT_SALARY;
    }
}
