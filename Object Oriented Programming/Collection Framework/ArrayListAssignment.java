import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignment {
    public static void main(String[] args) {
        //create ArrayList of Employee and print out the names
        Employee e1 = new Employee("Albert");
        Employee e2 = new Employee("Parul");
        Employee e3 = new Employee("Kamal");

        List<Employee> employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        for (Employee employee: employeeList){
            System.out.println(employee.name);
        }

    }
}
class Employee{
    String name;

    public Employee(String name){
        this.name = name;
    }
}
