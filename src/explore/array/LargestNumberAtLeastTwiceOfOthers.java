package explore.array;

public class LargestNumberAtLeastTwiceOfOthers {
    static public int dominantIndex(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == 0) || (nums[i] != nums[j] && nums[i] / nums[j] >= 2)) {
                    count++;
                }
            }
            if (count == nums.length - 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[];
        int r;
        a = new int[]{3, 6, 1, 0};
        r = LargestNumberAtLeastTwiceOfOthers.dominantIndex(a);
        System.out.println(r);

        a = new int[]{1, 2, 3, 4};
        r = LargestNumberAtLeastTwiceOfOthers.dominantIndex(a);
        System.out.println(r);

        a = new int[]{1};
        r = LargestNumberAtLeastTwiceOfOthers.dominantIndex(a);
        System.out.println(r);

        a = new int[]{0, 0, 0, 1};
        r = LargestNumberAtLeastTwiceOfOthers.dominantIndex(a);
        System.out.println(r);
    }
}
