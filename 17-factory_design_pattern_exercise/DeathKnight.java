public class DeathKnight implements RPGClass {
    private final String Skills;
    private String race;

    public DeathKnight() {
        Skills = "Death and Decay, Death-Coil, Death-Grip, Death-Strike, Mind-Freeze, Rune-Strike, Raise-Dead";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Death-Knight created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
