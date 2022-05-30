package explore.array;

import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximumNumber {
    static public int thirdMax(int[] nums) {
        Integer[] nums_integer = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums_integer[i] = nums[i];
        }
        Arrays.sort(nums_integer, Collections.reverseOrder());
        int writerPointer = 1;
        for (int readPointer = 1; readPointer < nums_integer.length; readPointer++) {

            if (nums_integer[readPointer] - nums_integer[readPointer - 1] != 0) {
                nums_integer[writerPointer] = nums_integer[readPointer];
                writerPointer++;
            }
        }
//        System.out.println(writerPointer + " " + Arrays.toString(nums_integer));
        if (writerPointer < 3) {
            return nums_integer[0];
        } else {
            return nums_integer[2];
        }
    }

    public static void main(String[] args) {
        int a[];
        int r;
        a = new int[]{3, 2, 1};
        r = ThirdMaximumNumber.thirdMax(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
        a = new int[]{1, 2};
        r = ThirdMaximumNumber.thirdMax(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
        a = new int[]{2, 2, 3, 1};
        r = ThirdMaximumNumber.thirdMax(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
        a = new int[]{1, 2, -2147483648};
        r = ThirdMaximumNumber.thirdMax(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
        a = new int[]{5, 2, 4, 1, 3, 6, 0};
        r = ThirdMaximumNumber.thirdMax(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
        a = new int[]{1, 1, 2};
        r = ThirdMaximumNumber.thirdMax(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
        a = new int[]{-2147483648, -2147483648, -2147483648, -2147483648, 1, 1, 1};
        r = ThirdMaximumNumber.thirdMax(a);
        for (int i : a) {
//            System.out.print(i + " ");
        }
        System.out.println(r);
    }
}
