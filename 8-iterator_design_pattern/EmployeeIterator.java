public class EmployeeIterator implements Iterator<Employee> {
    private final EmployeeListAggregate employeeList;
    private int index = 0;

    public EmployeeIterator(EmployeeListAggregate employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public boolean hasNext() {
        // Check if there are more employees in the list
        return index < employeeList.getSize();
    }

    @Override
    public Employee next() {
        // Get the next employee in the list and increment the index
        return employeeList.get(index++);
    }

    @Override
    public Employee currentItem()
    {
        // Get the current employee in the list
        return employeeList.get(index);
    }
}
