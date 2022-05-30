package explore.array;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentMaxCount = 0;
        int tempCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempCount++;
            }
            if (nums[i] == 0 || i == nums.length - 1) {
                if (tempCount > currentMaxCount) {
                    currentMaxCount = tempCount;
                }
                tempCount = 0;
            }
        }
        return currentMaxCount;
    }

    public static void main(String[] args) {
        var obj = new MaxConsecutiveOnes();
        System.out.println(
                obj.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})
        );
        System.out.println(
                obj.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1})
        );
    }
}
