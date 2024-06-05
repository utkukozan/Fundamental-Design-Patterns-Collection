public class Mage implements RPGClass{
    private final String Skills;
    private String race;

    public Mage() {
        Skills = "Frost-Bold, Fire-Blast, Frost-Nova, Blink, Conjure-Refreshment, CounterSpell, Polymorph";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Mage created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
