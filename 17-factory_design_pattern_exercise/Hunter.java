public class Hunter implements RPGClass{
    private final String Skills;
    private String race;

    public Hunter() {
        Skills = "Steady-Shot, Arcane-Shot, Wing-Clip, Disengage, Beast-Lore, Call-Pet";
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void create() {
        System.out.println("Hunter created with following skills: " + Skills + "\nRace is " + this.race);
    }
}
