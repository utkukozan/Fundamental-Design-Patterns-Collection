public class Main {
    // This design pattern is used when there are similar classes in a program, instead of using the new operator each time.
    // It falls under the Creational Patterns category.
    public static void main(String[] args) {
        Factory factory = new Factory();
        Game playstationGame = factory.createGame("Playstation");
        Game pcGame = factory.createGame("PC");
        Game xboxGame = factory.createGame("Xbox");

        playstationGame.setPlatform();
        pcGame.setPlatform();
        xboxGame.setPlatform();
    }
}
