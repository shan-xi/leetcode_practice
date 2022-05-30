package explore.array;

public class ReplaceElementsWithGreatestElementOnRightSide {
    static public int[] replaceElements(int[] arr) {

        int cm = 0;
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                cm = arr[i];
                arr[i] = -1;
                continue;
            }
            temp = arr[i];
            arr[i] = cm;
            if (temp > cm) {
                cm = temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a;
        int[] r;
        a = new int[]{17, 18, 5, 4, 6, 1};
        r = ReplaceElementsWithGreatestElementOnRightSide.replaceElements(a);
        for (int n : r) {
            System.out.print(n + " ");
        }
        System.out.println();
        a = new int[]{400};
        r = ReplaceElementsWithGreatestElementOnRightSide.replaceElements(a);
        for (int n : r) {
            System.out.print(n + " ");
        }
    }
}
