package explore.array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int len = 0;
        for (int i = 0; i < 6; i++) {
            arr[len++] = i;
        }
        System.out.println("Does the array contain the element 4? - " + ArraySearch.linearSearch(arr, len, 4));
        System.out.println("Does the array contain the element 30? - " + ArraySearch.linearSearch(arr, len, 30));
    }

    public static boolean linearSearch(int[] arr, int len, int ele) {
        if (arr == null || len == 0) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] == ele) {
                return true;
            }
        }
        return false;
    }
}
