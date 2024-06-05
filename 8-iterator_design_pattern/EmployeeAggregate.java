public interface EmployeeAggregate {
    // This interface represents an employee aggregate, which is a collection of employees.

    // This method creates an iterator for iterating over the employees in the aggregate.
    Iterator<Employee> createIterator();
}
