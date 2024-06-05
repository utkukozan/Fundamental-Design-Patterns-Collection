public class Rogue implements RPGClass{
    private final String Skills;
    private String race;

    public Rogue() {
        Skills = "Sinister Strike, Eviscerate, Cheap-Shot, Stealth, Fleet-Footed, Sprint, Kick, Ambush, Crimson Vial";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Rogue created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
