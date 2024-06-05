public class Main {
    // This belongs to the creational design patterns.
    // If a class has only one instance, we can access that instance through a single object throughout the application.
    // When implementing a multi-threaded singleton, the first instance created needs to be locked.
    // If locking is not implemented, two different threads may create new instances without accessing the result of the first one.
    // The singleton pattern prevents multiple objects from being created from a class and ensures the use of a single object created in the virtual machine.
    // It can also be used to control the number of objects created from a class.
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}
