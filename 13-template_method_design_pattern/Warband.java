public class Warband extends Game {
    @Override
    void loadGraphics() {
        System.out.println("Character and shadow details loaded!");
    }

    @Override
    void loadAudios() {
        System.out.println("Horse and Sword sound effects loaded!");
    }

    @Override
    void loadScenario() {
        System.out.println("Scenario loaded!");
    }
}
