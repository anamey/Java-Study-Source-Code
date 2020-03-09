import java.util.*;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("hh", 35000);
        staff[1] = new Employee("ch", 75000);
        staff[2] = new Employee("fh", 38000);

        Arrays.sort(staff);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}