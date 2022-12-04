public class Archer extends Warrior<Bow, WoodenShield>{

    private Integer range;

    public Archer(String name, Bow weapon, Integer healthPoint, Integer range, WoodenShield shield) {
        super(name, weapon, healthPoint, shield);
        this.range = range;
    }

    public Archer(String name, Bow weapon, Integer healthPoint, Integer range) {
        super(name, weapon, healthPoint);
        this.range = range;
    }

    
    public Integer getRange() {
        return range;
    }

    public String toString() {
        return String.format("Archer: %s  range: %d ", super.toString(), range);
    }


}
