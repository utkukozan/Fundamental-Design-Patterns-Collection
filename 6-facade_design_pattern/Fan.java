public class Fan
{
    boolean power;
    public Fan (boolean power){
        this.power=power;
        if (power==true){
            System.out.println("Fan is opened ! They are ready for cinema");
        }
        else
            System.out.println("Fan is closed !");
    }
}
