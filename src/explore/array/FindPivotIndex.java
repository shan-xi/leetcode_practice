package explore.array;

public class FindPivotIndex {
    static public int pivotIndex(int[] nums) {
        int t_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            t_sum += nums[i];
        }

        int l_sum = 0;
        for (int c = 0; c < nums.length; c++) {
            t_sum -= nums[c];
            if (c > 0)
                l_sum += nums[c - 1];
            if (t_sum == l_sum)
                return c;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a;
        int r;
        a = new int[]{1, 7, 3, 6, 5, 6};
        r = FindPivotIndex.pivotIndex(a);
        System.out.println(r);

        a = new int[]{1, 2, 3};
        r = FindPivotIndex.pivotIndex(a);
        System.out.println(r);

        a = new int[]{2, 1, -1};
        r = FindPivotIndex.pivotIndex(a);
        System.out.println(r);
    }
}
