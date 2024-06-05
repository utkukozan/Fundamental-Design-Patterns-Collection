public class Main {
    public static void main(String[] args) {
        // The Template Method design pattern allows us to define the skeleton of an algorithm in the superclass
        // and allows subclasses to redefine (override) certain steps of the algorithm without breaking the overall structure.
        
        // Create a Warband game object and execute the template method
        Game game = new Warband();
        game.templateMethod(); // All methods are executed in a sequential manner.
        
        System.out.println("___________________________________________");
        
        // Create a Forza Horizon game object and execute the template method
        Game game2 = new ForzaHorizon();
        game2.templateMethod(); // All methods are executed in a sequential manner.
    }
}
