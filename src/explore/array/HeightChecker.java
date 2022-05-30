package explore.array;

import java.util.Arrays;

public class HeightChecker {
    static public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[];
        int r;

        a = new int[]{1, 1, 4, 2, 1, 3};
        r = HeightChecker.heightChecker(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);

        a = new int[]{5, 1, 2, 3, 4};
        r = HeightChecker.heightChecker(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);

        a = new int[]{1, 2, 3, 4, 5};
        r = HeightChecker.heightChecker(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
    }
}
