import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        System.out.println(getFloat());
    }

    public static float getFloat() {
        float input = 0f;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                input =  scanner.nextFloat();
                break;
            }
        }
        return input;
    }
}
