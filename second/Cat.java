public class Cat extends Animal implements Speakable, Runable{

    public Cat(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak() {
        return "mew";
    }

    @Override
    public String run() {
        return "20 mph";
    }

    
}