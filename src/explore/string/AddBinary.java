package explore.string;

public class AddBinary {
    static public String addBinary(String a, String b) {
//        char[] ca = a.toCharArray();
//        char[] cb = b.toCharArray();
        int c = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int t = Math.max(i + 1, j + 1) + 1;
        int va = 0;
        int vb = 0;
        StringBuilder sb = new StringBuilder();
        while (t > 0) {
            va = 0;
            vb = 0;
            if (i >= 0) {
//                va = Character.getNumericValue(ca[i]);
                va = a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
//                vb = Character.getNumericValue(cb[j]);
                vb = b.charAt(j) - '0';
                j--;
            }
            int cur = va + vb + c;
            if (cur > 2) {
                c = 1;
                cur = 1;
            } else if (cur == 2) {
                c = 1;
                cur = 0;
            } else if (cur == 1) {
                c = 0;
            } else {
                c = 0;
                cur = 0;
            }

            if (cur == 0) {
                if (t != 1) {
                    sb.append(cur);
                }
            } else {
                sb.append(cur);
            }
            t--;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String r;
        r = AddBinary.addBinary("11", "1");
        System.out.println(r);
        r = AddBinary.addBinary("1010", "1011");
        System.out.println(r);
        r = AddBinary.addBinary("0", "0");
        System.out.println(r);
    }
}
