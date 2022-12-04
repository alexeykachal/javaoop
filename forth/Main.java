public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro", new Staff(),150);
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Robin", new LongBow(),  100, 10, new WoodenShield()));
        red.add(new Archer("John", new Bow(), 100, 10, new WoodenShield()));
        Hero hero2 = new Hero("Heroy", new Staff(),250, new IronShield());
        Team<Warrior> blue = new Team<>(hero2);
        blue.add(new Mage("Spellor", new Staff(), 100, 15, 30, new MagicShield()));
        blue.add(new Archer("Jerry", new Bow(), 100, 12));

        System.out.println(red);
        System.out.println(blue);
        System.out.println(blue.getTeamHealthPoint());


    }


}