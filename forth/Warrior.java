
public abstract class Warrior<T,S> {
    private String name;
    private T weapon;
    private S shield;
    private Integer healthPoint;

    
    public Warrior(String name, T weapon, Integer healthPoint, S shield) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
        this.shield = shield;
    }

    public Warrior(String name, T weapon, Integer healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }


    public T getWeapon() {
        return weapon;
    }


    public Integer getHealthPoint() {
        return healthPoint;
    }


    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }


    @Override
    public String toString() {
        if (this. shield == null){
            return String.format("%s %s health: %d", name, weapon, healthPoint);
        }
        return String.format("%s %s %s health: %d", name, weapon, shield, healthPoint);
        
    }


}