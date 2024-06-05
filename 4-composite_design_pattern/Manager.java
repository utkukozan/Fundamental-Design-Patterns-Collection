public class Manager implements Employee
{
    String name;
    Manager(String name){
        this.name = name;
    }
    @Override
    public void ShowEmployees()
    {
        System.out.println("Manager " + name);
    }
}
