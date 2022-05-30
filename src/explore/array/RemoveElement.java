package explore.array;

public class RemoveElement {
    static public int removeElement(int[] nums, int val) {

        /*

              R
          W
        3 2 2 3
        2 3 2 3
        2 2 3 3
        2 2 3 3


        R
        W
        0 1 2 3 4 0 4 2


        R
        W
        0 1 2 2 3 4 0 4 2

                      R
                  W
        0 1 2 2 3 0 4 2
        0 1 2 2 3 0 4 2
        0 1 2 2 3 0 4 2
        0 1 2 2 3 0 4 2
        0 1 3 2 2 0 4 2
        0 1 3 0 2 2 4 2
        0 1 3 0 4 2 2 2
        0 1 3 0 4 2 2 2

          R
          W
        3 3
        3 3

         */

        int writePointer = 0;
        if (nums == null || nums.length == 0)
            return 0;
        for (int readerPointer = 0; readerPointer < nums.length; readerPointer++) {
            if (nums[readerPointer] != val) {
                nums[writePointer] = nums[readerPointer];
                writePointer++;
            }
        }

        return writePointer;
    }

    public static void main(String[] args) {
        int a = RemoveElement.removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println("count=" + a);
        int b = RemoveElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        System.out.println("count=" + b);
        int c = RemoveElement.removeElement(new int[]{1}, 1);
        System.out.println("count=" + c);
        int d = RemoveElement.removeElement(new int[]{2}, 3);
        System.out.println("count=" + d);
        int e = RemoveElement.removeElement(new int[]{3, 3}, 5);
        System.out.println("count=" + e);
    }
}
