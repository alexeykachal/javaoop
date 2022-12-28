
public class Third {
    public static void main(String[] args) {

        int[] array1 = { 1, 0, 5, 6, 7 };
        int[] array2 = { 2, 4, 6, 7, 8 };
        showArray(fillDiv(array1, array2));

    }

    public static int[] fillDiv(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            if (array1[i] == 0) {
                throw new RuntimeException("Операция деления на ноль на индексе " + i);
            }
            result[i] = array2[i] / array1[i];
        }
        return result;
    }

    public static void showArray(int[] array) {
        for (int e : array) {
            System.out.print(e + " ");
        }
    }
}
