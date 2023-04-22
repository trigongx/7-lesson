public class Medic extends Hero {
    private int healPoints;

    public Medic(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public String increaseExperience(){
        System.out.println(healPoints * 0.1);
        setHealPoints((int) (getHealPoints() + healPoints * 0.1));

        return null;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied super ability HEAL POINTS");
    }
}
