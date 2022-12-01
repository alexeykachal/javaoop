public class Nuts extends Product {
    Double calories;

    public Nuts(String name) {
        super(name);
    }

    public Nuts (String name, Double price) {
        super(name, price);
    }

    public Nuts(String name, Double price, Double calories) {
        super(name, price);
        this.calories = calories;
    }

    public Double getCalories(){
        return this.calories;
    }

    @Override
    public String toString() {
        return String.format("%s %,.2f\n",super.toString(), getCalories());
    }


}