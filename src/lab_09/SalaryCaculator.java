package lab_09;

import java.util.List;

public class SalaryCaculator {
    //IS - Relationship

    public int getTotalSalary(List<Employee> employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();

        }
        return totalSalary;
    }
}