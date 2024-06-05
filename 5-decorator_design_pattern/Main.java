public class Main {
    // Decorator Design Pattern; It is a design pattern that adds dynamic features to an object, which is part of the Structural Design Patterns category.
    // It demonstrates that properties can be added to an object without using inheritance.
    // It is used to add properties to an object at runtime.
    // The decorator pattern is used to extend the functionality of an existing class's existing method, rather than adding a method to a class.
    // It is compliant with the Open-Closed Principle, which means that classes are open for extension but closed for modification.
    // For example, in the Observer design pattern, we did not make any changes to the observed class when adding new observers.
    // Example Application: Coffee application, adding new features to coffee
    // Component: Interface of the method to be extended
    // ConcreteComponent: Class that implements the system interface
    // Operation: Method to be extended
    // Decorator: Class that provides access to the ConcreteComponent, implements the system interface

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2); // Double Mocha
        beverage2 = new Whip(beverage2); // Added Whip
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
