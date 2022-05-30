package explore.array;

public class DuplicateZeros {
    static public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            if (arr[j] == 0) {
                for (int i = len - 2; i >= j + 1; i--) {
                    arr[i + 1] = arr[i];
                }
                if (j + 1 < len) {
                    arr[j + 1] = 0;
                    j++;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        DuplicateZeros.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        DuplicateZeros.duplicateZeros(new int[]{1, 2, 3});
        DuplicateZeros.duplicateZeros(new int[]{0, 0, 0, 0, 0, 0, 0});

    }
}
