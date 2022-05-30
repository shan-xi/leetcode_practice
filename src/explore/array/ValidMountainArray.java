package explore.array;

import java.util.Arrays;

public class ValidMountainArray {
    static public boolean validMountainArray(int[] arr) {
        int N = arr.length;
        int i = 0;

        while (i < N - 1 && arr[i + 1] > arr[i]) {
            i++;
        }
        if (i == 0 || i == N - 1) return false;

        while (i < N - 1 && arr[i + 1] < arr[i]) {
            i++;
        }
        return i == N - 1;
    }

    public static void main(String[] args) {
        int[] arr;
        boolean r = false;
        arr = new int[]{2, 1};
        r = ValidMountainArray.validMountainArray(arr);
        System.out.println(r + " " + Arrays.toString(arr));
        arr = new int[]{3, 5, 5};
        r = ValidMountainArray.validMountainArray(arr);
        System.out.println(r + " " + Arrays.toString(arr));
        arr = new int[]{0, 3, 2, 1};
        r = ValidMountainArray.validMountainArray(arr);
        System.out.println(r + " " + Arrays.toString(arr));
        arr = new int[]{2, 0, 2};
        r = ValidMountainArray.validMountainArray(arr);
        System.out.println(r + " " + Arrays.toString(arr));
        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        r = ValidMountainArray.validMountainArray(arr);
        System.out.println(r + " " + Arrays.toString(arr));
        arr = new int[]{0, 1, 2, 3, 4, 8, 9, 10, 11, 12, 11};
        r = ValidMountainArray.validMountainArray(arr);
        System.out.println(r + " " + Arrays.toString(arr));
    }
}
