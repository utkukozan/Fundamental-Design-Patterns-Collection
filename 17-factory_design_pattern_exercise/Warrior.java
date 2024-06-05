public class Warrior implements RPGClass{
    private final String Skills;
    private String race;

    public Warrior() {
        Skills = "Slam, Charge, Shield-Slam, Hamstring, Victory-Rush, Execute, Taunt";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Warrior created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
