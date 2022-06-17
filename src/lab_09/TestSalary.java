package lab_09;

import lab_07_1.ContractEmployee;
import lab_07_1.Employee;
import lab_07_1.FTE;
import lab_07_1.SalaryCaculator;

import java.util.ArrayList;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {

        lab_07_1.SalaryCaculator salaryCaculator = new SalaryCaculator();
        lab_07_1.FTE fte = new FTE("FulltimeEmployee");
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
