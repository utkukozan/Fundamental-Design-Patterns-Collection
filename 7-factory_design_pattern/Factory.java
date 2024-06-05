public class Factory {
    public Game createGame(String gameType){
        Game game = null;
        switch (gameType){
            case "PC":
                game = new PC();
                break;
            case "Playstation":
                game = new Playstation();
                break;
            case "Xbox":
                game = new Xbox();
                break;
        }
        return game;
    }
}
