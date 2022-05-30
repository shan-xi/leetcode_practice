package explore.array;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;
        Integer[] a = {0, 1, 2, 3, 4};
        v1 = new ArrayList<>(Arrays.asList(a));
        System.out.println(v0.size());
        System.out.println(v1.size());
        Collections.sort(v1, Collections.reverseOrder());
        for (int i : v1) {
            System.out.println(i);
        }
        v1.remove(v1.size()-1);
        for (int i : v1) {
            System.out.println(i);
        }
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
            System.out.print("index " + i + " = " + nums[i] + " : ");
            for (int n : nums) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        // Return the new length.
        return length;
    }

    static void DVD_example() {
        DVD[] dvdCollection = new DVD[15];
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whendon");
        dvdCollection[7] = avengersDVD;

        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        dvdCollection[3] = incrediblesDVD;
        dvdCollection[9] = findingDoryDVD;
        dvdCollection[2] = lionKingDVD;

        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollection[3] = starWarsDVD;
        System.out.println(dvdCollection[3]);
    }

    static void loop_example() {
        var squareNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            var square = (i + 1) * (i + 1);
            squareNumbers[i] = square;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(squareNumbers[i]);
        }

        for (var s : squareNumbers) {
            System.out.println(s);
        }
    }

    static void arr_length_example() {
        var arr = new int[6];
        var length = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = i * i;
            length++;
        }
        System.out.println("capacity: " + arr.length);
        System.out.println("length: " + length);
    }
}
