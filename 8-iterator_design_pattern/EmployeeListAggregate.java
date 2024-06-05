import java.util.ArrayList;
import java.util.List;

public class EmployeeListAggregate implements EmployeeAggregate {
    private final List<Employee> employeeList;

    public EmployeeListAggregate() {
        employeeList = new ArrayList<>();
    }

    // Add an employee to the list
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    // Get the size of the employee list
    public int getSize() {
        return employeeList.size();
    }

    // Get an employee at a specific index
    public Employee get(int index) {
        return employeeList.get(index);
    }

    // Create and return an iterator for the employee list
    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(this);
    }
}
