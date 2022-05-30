package explore.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    static public int removeDuplicates(int[] nums) {

        int count = 0;
        int t = nums.length;
        int temp = 0;
        for (int i = 1; i < t; i++) {
            temp = nums[i];
            if (nums[i - 1] == temp && temp != -101) {
                for (int j = i; j < t - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[t - 1] = -101;
                count++;
                i--;
            }
        }

        return t - count;
    }

    public static void main(String[] args) {
        int[] arr;
        int r = 0;
        arr = new int[]{1, 1, 2, 2};
        r = RemoveDuplicatesFromSortedArray.removeDuplicates(arr);
        System.out.println(r + " " + Arrays.toString(arr));

        arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        r = RemoveDuplicatesFromSortedArray.removeDuplicates(arr);
        System.out.println(r + " " + Arrays.toString(arr));

    }
}
