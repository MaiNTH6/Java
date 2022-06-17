package lab_07_1;

import java.util.ArrayList;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {

        SalaryCaculator salaryCaculator = new SalaryCaculator();
        FTE fte = new FTE("FulltimeEmployee");
        ContractEmployee contractEmployee = new ContractEmployee("ContractEmployee");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(fte);
        employeeList.add(fte);
        employeeList.add(fte);
        employeeList.add(contractEmployee);
        employeeList.add(contractEmployee);

        System.out.println(salaryCaculator.getTotalSalary(employeeList));

    }
}
