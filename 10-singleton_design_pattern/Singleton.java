public class Singleton {
    private static Singleton instance;

    private Singleton(){
        // Private constructor to prevent instantiation from outside the class
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            // Create a new instance if it doesn't exist
        }
        return instance;
        // Return the existing instance
    }
}
