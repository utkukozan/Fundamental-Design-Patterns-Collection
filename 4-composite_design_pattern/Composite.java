import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee
{
    private List<Employee> employeeList = new ArrayList<Employee>();
    @Override
    public void ShowEmployees()
    {
        for (Employee e : employeeList){
            e.ShowEmployees();
        }
    }
    public void addEmployee(Employee e){
        employeeList.add(e);
    }
}
