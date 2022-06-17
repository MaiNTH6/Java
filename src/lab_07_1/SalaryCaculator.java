package lab_07_1;

import java.util.List;

public class SalaryCaculator {

    public int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();

        }
        return totalSalary;
    }
}
