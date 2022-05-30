package explore.array;

public class InPlace {
    static public int[] squareEven(int[] array, int length) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                array[i] *= array[i];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[]{9, -2, -9, 11, 56, -12, -3};
        int[] r = InPlace.squareEven(a, a.length);
        for (int n : r) {
            System.out.print(n + " ");
        }
    }
}
