public class Monk implements RPGClass{
    private final String Skills;
    private String race;

    public Monk() {
        Skills = "Tiger-Palm, Blackout-Kick, Roll, Leg-Sweep, Expel Harm";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Monk created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
