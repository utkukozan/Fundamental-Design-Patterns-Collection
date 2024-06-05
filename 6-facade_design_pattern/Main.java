public class Main {
    // Facade Design Pattern simplifies complex interfaces in subsystems by providing a unified interface.
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchCinema();
        // If there was no Facade, the following code block would have been executed.
        /*  Fan fan = new Fan(true);
            Lamp lamp = new Lamp(true);
            Monitor monitor = new Monitor(true);
            if (fan.power == true && lamp.power == true && monitor.power == true)
                System.out.println("Everything is ready to watch a movie!");
         */
    }
}
