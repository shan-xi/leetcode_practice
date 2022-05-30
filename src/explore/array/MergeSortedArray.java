package explore.array;

import java.util.Arrays;

public class MergeSortedArray {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] a2 = new int[]{2, 5, 6};
        MergeSortedArray.merge(a1, 3, a2, 3);
        for (int a : a1) {
            System.out.print(a + " ");
        }
        System.out.println();
        a1 = new int[]{1};
        a2 = new int[]{};
        MergeSortedArray.merge(a1, 1, a2, 0);
        for (int a : a1) {
            System.out.print(a + " ");
        }
        System.out.println();

        a1 = new int[]{0};
        a2 = new int[]{1};
        MergeSortedArray.merge(a1, 0, a2, 1);
        for (int a : a1) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
