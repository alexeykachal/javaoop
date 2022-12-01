public class Duck extends Animal implements Flyable, Runable, Speakable, Swimable{

    public Duck(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    
    

    }

    @Override
    public String fly() {
        return "50 mph";
    }

    @Override
    public String run() {
        return "5 mph";
    }

    @Override
    public String speak() {
        return "kryakrya";
    }

    @Override
    public String swim() {
        return "7 mph";
    }

}