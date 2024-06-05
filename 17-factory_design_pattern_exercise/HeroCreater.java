public class HeroCreater { //Factory Class
    public static RPGClass getInstance(String type) {
        switch (type) {
            case "1":
                return new Mage();
            case "2":
                return new DeathKnight();
            case "3":
                return new DemonHunter();
            case "4":
                return new Hunter();
            case "5":
                return new Druid();
            case "6":
                return new Monk();
            case "7":
                return new Paladin();
            case "8":
                return new Warrior();
            case "9":
                return new Rogue();
        }
        return null;
    }
}
