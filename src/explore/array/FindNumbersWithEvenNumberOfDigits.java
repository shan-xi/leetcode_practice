package explore.array;

public class FindNumbersWithEvenNumberOfDigits {
    static public int findNumbers(int[] nums) {
        int count = 0;
//        int t = 1;
        for (int i = 0; i < nums.length; i++) {
//            int n = nums[i];
//            t = 1;
//            while (n >= 10) {
//                n /= 10;
//                t++;
//            }
//            if (t % 2 == 0) {
//                count++;
//            }
            if (((int) Math.log10(nums[i]) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(findNumbers(new int[]{555, 901, 482, 1771}));
        System.out.println(findNumbers(new int[]{100000}));
    }
}
