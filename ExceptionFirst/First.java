import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        addOne(1);
        createNegativeLenght(-1);
        StringToInt("");
    }

    public static int addOne(int x) {
        return addOne(x + 1);
    }

    public static int[] createNegativeLenght(int size) {
        return new int[size];
    }

    public static int StringToInt(String input) {
        return Integer.parseInt(input);
    }

}
