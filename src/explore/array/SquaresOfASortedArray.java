package explore.array;

import java.util.Arrays;

public class SquaresOfASortedArray {
    static public int[] sortedSquares(int[] nums) {
        int n = 0;
        int t = nums.length;
        for (int i = 0; i < t; i++) {
            n = nums[i];
            nums[i] = n * n;
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        for (var i : SquaresOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (var i : SquaresOfASortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11})) {
            System.out.print(i + " ");
        }
    }
}
