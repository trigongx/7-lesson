
public class Main {
    public static void main(String[] args) {
            HavingSuperAbility[] heroes = {new Magic(),new Medic(50),new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
        heroes[i].applySuperAbility();
            if (heroes[i] instanceof  Medic){
                System.out.println(((Medic) heroes[i]).getHealPoints());
                ((Medic)heroes[i]).increaseExperience();
                System.out.println(((Medic) heroes[i]).getHealPoints());
            }

        }

        }

    }


