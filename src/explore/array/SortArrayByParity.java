package explore.array;

public class SortArrayByParity {
    static public int[] sortArrayByParity(int[] nums) {
        /**
         *       R
         *     W
         * 2 4 5 6
         * 2 4 5 6
         */

        int writePointer = 0;
        int temp = 0;
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] % 2 == 0) {

                while (nums[writePointer] % 2 == 0 && writePointer < readPointer) {
                    writePointer++;
                }
                if (nums[readPointer] % 2 == 0 && nums[writePointer] % 2 == 0) continue;
                temp = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = temp;
                writePointer++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[]{3, 1, 2, 4};
        SortArrayByParity.sortArrayByParity(a);
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
        a = new int[]{0};
        SortArrayByParity.sortArrayByParity(a);
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
        a = new int[]{2, 4, 5, 6};
        SortArrayByParity.sortArrayByParity(a);
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
        a = new int[]{1, 3, 5, 7};
        SortArrayByParity.sortArrayByParity(a);
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();

    }
}
