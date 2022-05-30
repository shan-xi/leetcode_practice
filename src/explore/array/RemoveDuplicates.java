package explore.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates.copyWithRemovedDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        RemoveDuplicates.copyWithRemovedDuplicates(new int[]{1, 1, 2});
    }

    static public int copyWithRemovedDuplicates(int[] nums) {
        if (nums == null) return 0;
        int writerPointer = 1;
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writerPointer] = nums[readPointer];
                writerPointer++;
            }
        }
        return writerPointer + 1;
    }

    static public int removeDuplicates(int[] nums) {

        // The initial length is simply the capacity.
        int length = nums.length;

        // Assume the last element is always unique.
        // Then for each element, delete it iff it is
        // the same as the one after it. Use our deletion
        // algorithm for deleting from any index.
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] == nums[i + 1]) {
                // Delete the element at index i, using our standard
                // deletion algorithm we learned.
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                // Reduce the length by 1.
                length--;
            }
        }
        // Return the new length.
        return length;
    }
}
