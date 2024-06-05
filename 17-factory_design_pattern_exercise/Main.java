import java.util.Scanner;

public class Main { //Main Class, Character choosing and market using is here!
    //CHARACTER CREATION PART
    public static void main(String[] args) {
        System.out.println("Lore of Warcraft - MMORPG Game Character Selection ");
        String race = "";
        System.out.println("Enter your character class for game");
        System.out.println("1-Mage, 2-Death-Knight, 3-Demon-Hunter, 4-Hunter, 5-Druid, 6-Monk, 7-Paladin, 8-Warrior, 9-Rogue, 10-Exit");
        Scanner scanner = new Scanner(System.in); //If we created all classes one by one using "new", there would be code redundancy.
        String type = scanner.nextLine();
        if (!type.equalsIgnoreCase("10")) {
            System.out.println("Enter your choice for race, 1-Alliance, 2-Horde");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    race = "Alliance";
                    break;
                case 2:
                    race = "Horde";
                    break;
            }
        }

        RPGClass rpgClass = null;
        if(!type.equalsIgnoreCase("10")){
            rpgClass = HeroCreater.getInstance(type);
            rpgClass.setRace(race);
            rpgClass.create();

            System.out.println("Returning to the Market");
        }

        //MARKET PART
        System.out.println("Do you want to buy a Armor 16.00$ ? y/n");
        char choice = scanner.next().charAt(0);
        switch (choice){
            case 'y':
                Market armor = new Armor();
                System.out.println(armor.getDescription() + "->" + armor.getPrice() + " $ -> SOLD");
                System.out.println("Do you want to add a rune for 25.00 $ ? y/n");
                choice = scanner.next().charAt(0);
                switch (choice){
                    case 'y':
                        armor = new RuneDecorator(armor);
                        System.out.println(armor.getDescription() + "->" + armor.getPrice() + " $ -> SOLD");
                        break;
                }
                System.out.println("Do you want to add a rune for 25.00 $ ? y/n");
                choice = scanner.next().charAt(0);
                switch (choice){
                    case 'y':
                        armor = new BuffDecorator(armor);
                        System.out.println(armor.getDescription() + "->" + armor.getPrice() + " $ -> SOLD");
                        break;
                }
                break;
        }
        System.out.println("Do you want to buy a Weapon 15.00$ ? y/n");
        choice = scanner.next().charAt(0);
        switch (choice){
            case 'y':
                Market weapon = new Weapon();
                System.out.println(weapon.getDescription() + "->" + weapon.getPrice() + " $ -> SOLD");
                System.out.println("Do you want to add a rune for 25.00 $ ? y/n");
                choice = scanner.next().charAt(0);
                switch (choice){
                    case 'y':
                        weapon = new RuneDecorator(weapon);
                        System.out.println(weapon.getDescription() + "->" + weapon.getPrice() + " $ -> SOLD");
                        break;
                }
                System.out.println("Do you want to add a buff for 40.00 $ ? y/n");
                choice = scanner.next().charAt(0);
                switch (choice){
                    case 'y':
                        weapon = new BuffDecorator(weapon);
                        System.out.println(weapon.getDescription() + "->" + weapon.getPrice() + " $ -> SOLD");
                        break;
                }
                break;
        }
    }
}
