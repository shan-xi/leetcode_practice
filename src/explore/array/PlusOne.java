package explore.array;

import java.util.Arrays;

public class PlusOne {
    static public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        boolean need_increate_size = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                if (i - 1 >= 0) {
                    digits[i - 1] += 1;
                } else {
                    digits[i] = 0;
                    need_increate_size = true;
                }
            }
        }
//        System.out.println(need_increate_size + " " + Arrays.toString(digits));
        int[] r;
        if (need_increate_size) {
            r = new int[digits.length + 1];
            r[0] = 1;
            for (int i = 1; i < r.length; i++) {
                r[i] = digits[i - 1];
            }
            return r;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int a[];
        int r[];
        a = new int[]{1, 2, 3};
        r = PlusOne.plusOne(a);
        System.out.println(Arrays.toString(r));
        a = new int[]{4, 3, 2, 1};
        r = PlusOne.plusOne(a);
        System.out.println(Arrays.toString(r));
        a = new int[]{9};
        r = PlusOne.plusOne(a);
        System.out.println(Arrays.toString(r));
        a = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        r = PlusOne.plusOne(a);
        System.out.println(Arrays.toString(r));
        a = new int[]{9, 9};
        r = PlusOne.plusOne(a);
        System.out.println(Arrays.toString(r));
    }
}
