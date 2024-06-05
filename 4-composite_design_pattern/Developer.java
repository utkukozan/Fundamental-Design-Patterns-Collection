public class Developer implements Employee
{
    String name;
    Developer(String name){
        this.name = name;
    }
    @Override
    public void ShowEmployees()
    {
        System.out.println("Developer " + name);
    }
}
