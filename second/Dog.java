public class Dog extends Animal implements Speakable, Runable{

    public Dog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak() {
        return "gavgav";
    }

    @Override
    public String run() {
        return "10 mph";
    }

}