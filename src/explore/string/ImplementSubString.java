package explore.string;

public class ImplementSubString {
    public static void main(String[] args) {
        System.out.println(ImplementSubString.strStr("hello", "ll"));
        System.out.println(ImplementSubString.strStr("aaaaa", "bba"));
        System.out.println(ImplementSubString.strStr("", ""));
        System.out.println(ImplementSubString.strStr("a", "a"));
        System.out.println(ImplementSubString.strStr("a", "b"));
        System.out.println(ImplementSubString.strStr("", "b"));
        System.out.println(ImplementSubString.strStr("abc", "c"));
    }

    static public int strStr(String haystack, String needle) {
        int needle_len = needle.length();
        int haystack_len = haystack.length();
        if (needle_len == 0)
            return 0;

        if (haystack_len < needle_len) {
            return -1;
        }

        if (haystack_len == 1) {
            if (needle.charAt(0) == haystack.charAt(0)) {
                return 0;
            } else {
                return -1;
            }
        }

        int firstMatchIndex = -1;
        int count = 0;

        for (int i = 0; i < haystack_len; i++) {
//            System.out.println("check i=" + i);
            count = 0;
            firstMatchIndex = -1;
            for (int j = 0; j < needle_len && i + j < haystack_len; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                } else {
                    if (firstMatchIndex == -1)
                        firstMatchIndex = i;
                    count++;
//                    System.out.println(b);
                }
                if (count == needle_len) {
                    return firstMatchIndex;
                }
            }
        }

        return -1;
    }
}
