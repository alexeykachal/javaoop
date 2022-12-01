import java.util.*;

public class Zoo {
    private List<Animal> animals;
    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Cat("barsik", "scottish", "black", 4, 2),
        new Dog("archi", "jackrussel", "brown", 4, 1), 
        new Duck("utka", "selezen", "green", 2, 5), 
        new Fish("nemo", "fishka", "blue", 0, 3),
        new Dolphin("gold", "best", "blue", 0, 1)));
    } 

    public void talk() {
        for (Speakable item: getSpeakable()){
            System.out.printf("%s\n", item.speak());

        }
    }

    public List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal speakItem: animals){
            if (speakItem instanceof Speakable){
                result.add((Speakable) speakItem);
            }

        }
            result.add(new Radio());
            return result;
   
}

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal runItem: animals){
            if (runItem instanceof Runable){
                result.add((Runable) runItem);
            }

        }
            return result;

}

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal flyItem: animals){
            if (flyItem instanceof Flyable){
                result.add((Flyable) flyItem);
            }

        }
            return result;

    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal swimItem: animals){
            if (swimItem instanceof Swimable){
                result.add((Swimable) swimItem);
            }

        }
            return result;

    }

    public void run() {
        for (Runable item: getRunable()){
            System.out.printf("%s, %s\n", item.toString(),item.run());

        }
    }

    public void fly() {
        for (Flyable item: getFlyable()){
            System.out.printf("%s, %s\n", item.toString(),item.fly());

        }
    }

    public void swim() {
        for (Swimable item: getSwimable()){
            System.out.printf("%s, %s\n", item.toString(),item.swim());

        }
    }


}

