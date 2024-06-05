public class Monitor
{
    boolean power;
    public Monitor (boolean power){
        this.power=power;
        if (power==true){
            System.out.println("Monitor is opened ! They are ready for cinema");
        }
        else
            System.out.println("Monitor is closed !");
    }
}
