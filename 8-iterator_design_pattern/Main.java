public class Main {
    public static void main(String[] args) {
        // The Iterator design pattern is used to traverse elements in a collection.

        // Create employee objects
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee(2);
        Employee employee3 = new Employee(3);
        Employee employee4 = new Employee(4);

        // Create an employee list aggregate
        EmployeeListAggregate employeeList = new EmployeeListAggregate();

        // Add employees to the list
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);


        // Create an iterator for the employee list
        var iterator = employeeList.createIterator();

        // Traverse the employee list using the iterator
        while (iterator.hasNext()) {
            Employee current = iterator.currentItem();
            iterator.next();
            System.out.println(current.id);
        }
    }
}
