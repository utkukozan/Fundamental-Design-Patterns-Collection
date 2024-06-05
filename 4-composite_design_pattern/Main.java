public class Main
{
    public static void main(String[] args)
    {
        //Composite tasarım deseni, nesneleri ağaç yapısına göre düzenleyerek
        // ağaç yapısındaki alt üst ilişkisini kurmaya yarayan bir desendir.
        Employee developer = new Developer("Utku");
        Employee manager = new Manager("Ali");
        Composite c = new Composite();
        c.addEmployee(developer);
        c.addEmployee(manager);
        c.ShowEmployees();
    }
}
