public class Mage extends Warrior<Staff, MagicShield> {

    private Integer range;
    private Integer mana;

    public Mage(String name, Staff weapon, Integer healthPoint, Integer range, Integer mana, MagicShield shield) {
        super(name, weapon, healthPoint, shield);
        this.range = range;
        this.mana = mana;
    }

    public Mage(String name, Staff weapon, Integer healthPoint, Integer range, Integer mana) {
        super(name, weapon, healthPoint);
        this.range = range;
        this.mana = mana;
    }

    public Integer getRange() {
        return range;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("Mage: %s  range: %d  mana: %d", super.toString(), range, mana);
    }

}



