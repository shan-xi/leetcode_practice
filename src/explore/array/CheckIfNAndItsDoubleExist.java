package explore.array;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    static public boolean checkIfExist(int[] arr) {
        int t = arr.length;
        int temp = 0;
        Set<Integer> m = new HashSet<Integer>();
        for (int i = 0; i < t; i++) {
            temp = arr[i];
            if (m.contains(temp * 2) || (m.contains(temp / 2) && temp % 2 == 0)) {
                return true;
            }
            m.add(temp);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a;
        boolean r = false;
        a = new int[]{10, 2, 5, 3};
        r = CheckIfNAndItsDoubleExist.checkIfExist(a);
        System.out.println(r);

        a = new int[]{7, 1, 14, 11};
        r = CheckIfNAndItsDoubleExist.checkIfExist(a);
        System.out.println(r);

        a = new int[]{3, 1, 7, 11};
        r = CheckIfNAndItsDoubleExist.checkIfExist(a);
        System.out.println(r);

    }
}
