public abstract class Game {
    // Load graphics for the game
    abstract void loadGraphics();

    // Load audio files for the game
    abstract void loadAudios();

    // Load the game scenario
    abstract void loadScenario();

    // Template method that orchestrates the loading process
    public final void templateMethod() {
        loadGraphics();
        loadAudios();
        loadScenario();
    }
}
