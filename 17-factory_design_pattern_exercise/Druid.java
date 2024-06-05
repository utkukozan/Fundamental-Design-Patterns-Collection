public class Druid implements RPGClass{
    private final String Skills;
    private String race;

    public Druid() {
        Skills = "Wrath, Moonfire, Regrowth, Cat Form, Shred, Dash, Bear Form";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Druid created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
