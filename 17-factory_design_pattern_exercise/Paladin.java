public class Paladin implements RPGClass{
    private final String Skills;
    private String race;

    public Paladin() {
        Skills = "Crusader Strike, Judgment, Hammer of Justice, Word of Glory, Redemption, Divine Steed";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Paladin created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
