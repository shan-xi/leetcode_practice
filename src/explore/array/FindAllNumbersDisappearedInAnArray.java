package explore.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int writerPointer = 1;
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] - nums[readPointer - 1] != 0) {
                nums[writerPointer] = nums[readPointer];
                writerPointer++;
            }
        }
        List<Integer> rlist = new ArrayList<>();
//        for (int n = 0; n < writerPointer; n++) {
//            System.out.print(nums[n] + " ");
//        }
//        System.out.println();
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[r] == (i + 1)) {
                r++;
            } else {
                rlist.add(i + 1);
            }
        }

        return rlist;
    }

    public static void main(String[] args) {
        int[] a;
        List<Integer> rlist;
        a = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        rlist = FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(a);
        System.out.println(rlist.toString());

        a = new int[]{1, 1};
        rlist = FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(a);
        System.out.println(rlist.toString());

        a = new int[]{10, 2, 5, 10, 9, 1, 1, 4, 3, 7};
        rlist = FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(a);
        System.out.println(rlist.toString());


    }
}
