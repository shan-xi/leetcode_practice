package explore.array;

public class MoveZeroes {
    static public void moveZeroes(int[] nums) {
        /*
        INIT R = 0, W = 0
                 R
           W
        0, 1, 0, 3, 12
        1, 0, 0, 3, 12
        1, 0, 0, 3, 12
        1, 3, 0, 0, 12
        1, 3, 12, 0, 0

              R
           W
        1, 0, 1
        1, 0, 1
        1, 1, 0


         */

        int writePointer = 0;
        int temp = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                temp = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = temp;
                writePointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        a = new int[]{0};
        MoveZeroes.moveZeroes(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        a = new int[]{1, 0, 1};
        MoveZeroes.moveZeroes(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        a = new int[]{0, 0, 1};
        MoveZeroes.moveZeroes(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        a = new int[]{0, 1, 0};
        MoveZeroes.moveZeroes(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        MoveZeroes.moveZeroes(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
