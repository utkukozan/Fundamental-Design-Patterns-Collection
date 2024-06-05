public class DemonHunter implements RPGClass{
    private final String Skills;
    private String race;

    public DemonHunter() {
        Skills = "Chaos Strike, Demon's Bite, Fel Rush, Glide, Spectral Sight, Torment, Disrupt";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Death-Hunter created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
