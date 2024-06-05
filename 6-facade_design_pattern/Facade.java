public class Facade
{
    Fan fan;
    Lamb lamb;
    Monitor monitor;
    public Facade(){
        fan = new Fan(true);
        lamb = new Lamb(true);
        monitor = new Monitor(true);
    }
    public void watchCinema(){
        if (fan.power==true && lamb.power==true && monitor.power==true){
            System.out.println("Everything is ready for watch cinema !");
        }
    }
}
