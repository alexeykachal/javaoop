public class Hero extends Warrior<Weapon, IronShield>{

    public Hero(String name, Weapon weapon, Integer healthPoint, IronShield shield) {
        super(name, weapon, healthPoint, shield);
    }

    public Hero(String name, Weapon weapon, Integer healthPoint) {
        super(name, weapon, healthPoint);
    }


    public String toString() {
        return String.format("Hero: %s", super.toString());
    }


}