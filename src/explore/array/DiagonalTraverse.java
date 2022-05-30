package explore.array;

import java.util.Arrays;

public class DiagonalTraverse {
    static public int[] findDiagonalOrder(int[][] mat) {

        /**
         * 5
         * {1, 2, 3}
         * {4, 5, 6}
         * {7, 8, 9}
         *
         * k=0
         * i=0 j=0 -> 1
         *
         * k=1
         * i=0 j=1 -> 2
         * i=1 j=0 -> 4
         *
         * k=2
         * i=2 j=0 -> 7
         * i=1 j=1 -> 5
         * i=0 j=2 -> 3
         *
         * k=3
         * i=1 j=2 -> 6
         * i=2 j=1 -> 8
         *
         * k=4
         * i=2 j=2 -> 9
         *
         * 7
         * {1, 2, 3, 1}
         * {4, 5, 6, 1}
         * {7, 8, 9, 1}
         * {7, 8, 9, 1}
         *
         * 9
         * {1, 2, 3, 1, 1}
         * {4, 5, 6, 1, 1}
         * {7, 8, 9, 1, 1}
         * {7, 8, 9, 1, 1}
         * {7, 8, 9, 1, 1}
         *
         * 4
         * {1, 2}
         * {4, 5}
         * {7, 8}
         *
         * k=0
         * i=0 j=0 -> 1
         *
         * k=1
         * i=1 j=0 -> 4
         * i=0 j=1 -> 2
         *
         * k=2
         * i=2 j=0 -> 7
         * i=1 j=1 -> 5
         *
         * k=3
         * i=1 j=2 -> 8
         *
         *
         * 4
         * {1, 2, 3}
         * {4, 5, 6}
         *
         * 3
         * {1, 2}
         * {4, 5}
         *
         * 2
         * {1, 2}
         *
         * 2
         * {1}
         * {4}
         *
         * 1
         * {1}
         *
         * 4
         * {2,  5}
         * {8,  4}
         * {0, -1}
         *
         * k=0
         * i=0 j=0 -> 2
         *
         * k=1
         * i=0 j=1 -> 5
         * i=1 j=0 -> 8
         *
         * k=2
         * i=1 j=0 -> 0
         * i=1 j=1 -> 4
         *
         * k=3
         * i=2 j=1 -> -1
         *
         * 4
         * {2, 5,  8}
         * {4, 0, -1}
         * i=0 j=0 -> 2
         *
         * i=0 j=1 -> 5
         * i=1 j=0 -> 4
         *
         * i=1 j=1 -> 0
         * i=0 j=2 -> 8
         *
         * i=1 j=2 -> -1
         *
         * 6
         * {1, 2, 3, 4}
         * {5, 6, 7, 8}
         * {9,10,11,12}
         *
         * k=0
         * i=0 j=0 -> 1
         * k=1
         * i=0 j=1 -> 2
         * i=1 j=0 -> 5
         * k=2
         * i=2 j=0 -> 9
         * i=1 j=1 -> 6
         * i=0 j=2 -> 3
         * k=3
         * i=0 j=3 -> 4
         * i=1 j=2 -> 7
         * i=2 j=1 -> 10
         * k=4
         * i=2 j=2 -> 11
         * i=1 j=3 -> 8
         * k=5
         * i=3 j=2 -> 12
         *
         * 6
         * {2, 3, 4}
         * {5, 6, 7}
         * {8, 9, 10}
         * {11,12,13}}
         * k=0
         * i=0 j=0 -> 2
         * k=1
         * i=0 j=1 -> 3
         * i=1 j=0 -> 5
         * k=2
         * i=1 j=0 -> 8
         * i=1 j=1 -> 6
         * i=0 j=2 -> 4
         * k=3
         * i=1 j=2 -> 7
         * i=2 j=2 -> 9
         * i=3 j=0 -> 11
         * k=4
         * i=2 j=2 -> 12
         * i=3 j=1 -> 10
         * k=5
         * i=3 j=2 -> 13
         *
         * 7
         * { 2,  3,  4},
         * { 5,  6,  7},
         * { 8,  9, 10},
         * {11, 12, 13},
         * {14, 15, 16}}
         * k=0
         * 2
         * k=1
         * 35
         * k=2
         * 864
         * k=3
         * 7911
         * k=4
         * 141210
         * k=5
         * 1315
         * k=6
         * 16
         *
         *
         */

        int[] r = new int[mat.length * mat[0].length];
        int i = 0;
        int j = 0;
        int k = 0;
        int type = 0;
        if (mat.length != mat[0].length) {
            if ((mat.length == 1 && mat[0].length > 1) || (mat.length > 1 && mat[0].length == 1)) {
                k = Math.max(mat.length, mat[0].length);
            } else {

                if (mat.length > mat[0].length) {
                    type = 1;
                    k = mat.length + 2;
                } else {
                    type = 2;
                    k = mat[0].length + 2;
                }
            }
        } else {
            k = 2 * mat.length - 1;
        }
        System.out.println(k);

        if (mat.length == 1 && mat[0].length == 1) {
            r[0] = mat[0][0];
            return r;
        }

        if (mat.length == 1) {
            for (int y = 0; y < mat[0].length; y++)
                r[y] = mat[0][y];
            return r;
        }

        if (mat[0].length == 1) {
            int c = 0;
            for (int y = 0; y < mat.length; y++) {
                r[c++] = mat[y][0];
            }
            return r;
        }

        if (mat.length != mat[0].length) {
            if (mat.length < mat[0].length) {
                int c = 0;
                for (int q = 0; q < k; q++) {
                    System.out.println();
                    System.out.println("q=" + q);
                    if (q >= mat.length) {

                        if (q % 2 != 0) {

                            i = q - mat.length;
                            j = q - i;
                            while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length) {
                                System.out.print(mat[i][j]);
                                r[c++] = mat[i][j];
                                i++;
                                j--;
                            }
                        } else {
                            j = q - mat.length + 1;
                            i = q - j;
                            while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length) {
                                System.out.print(mat[i][j]);
                                r[c++] = mat[i][j];
                                i--;
                                j++;
                            }
                        }

                    } else {
                        if (q % 2 != 0) {
                            i = 0;
                            j = q;
                            while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length && i + j < k) {
                                System.out.print(mat[i][j]);
                                r[c++] = mat[i][j];
                                i++;
                                j--;
                            }
                        } else {
                            j = 0;
                            i = q;
                            while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length && i + j < k) {
                                System.out.print(mat[i][j]);
                                r[c++] = mat[i][j];
                                i--;
                                j++;
                            }
                        }
                    }
                }
            } else {

            }
        }

        if (mat.length == mat[0].length) {
            int c = 0;
            for (int q = 0; q < k; q++) {
                if (q >= mat.length || q >= mat[0].length) {
                    if (q % 2 != 0) {
                        i = q - mat.length + 1;
                        j = q - i;
                        while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length) {
                            System.out.print(mat[i][j]);
                            r[c++] = mat[i][j];
                            i++;
                            j--;
                        }
                    } else {
                        j = q - mat.length + 1;
                        i = q - j;
                        while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length) {
                            System.out.print(mat[i][j]);
                            r[c++] = mat[i][j];
                            i--;
                            j++;
                        }
                    }
                } else {
                    if (q % 2 != 0) {
                        i = 0;
                        j = q;
                        while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length && i + j < k) {
                            System.out.print(mat[i][j]);
                            r[c++] = mat[i][j];
                            i++;
                            j--;
                        }
                    } else {
                        j = 0;
                        i = q;
                        while (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length && i + j < k) {
                            System.out.print(mat[i][j]);
                            r[c++] = mat[i][j];
                            i--;
                            j++;
                        }
                    }
                }
            }
        }

        return r;
    }

    public static void main(String[] args) {
        int[][] a;
        int r[];
//        a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));
//        a = new int[][]{{1, 2}, {3, 4}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));
//        a = new int[][]{{2, 3}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));
//        a = new int[][]{{3}, {2}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));
//        a = new int[][]{{1}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));
//        a = new int[][]{{6, 9, 7}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));
//        a = new int[][]{{7}, {9}, {6}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));

        a = new int[][]{{2, 5}, {8, 4}, {0, -1}};
        r = DiagonalTraverse.findDiagonalOrder(a);
        System.out.println(Arrays.toString(r));

//        a = new int[][]{{2, 5, 8}, {4, 0, -1}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));

//        a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        r = DiagonalTraverse.findDiagonalOrder(a);
//        System.out.println(Arrays.toString(r));

        a = new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}};
        r = DiagonalTraverse.findDiagonalOrder(a);
        System.out.println(Arrays.toString(r));

        a = new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}, {14, 15, 16}};
        r = DiagonalTraverse.findDiagonalOrder(a);
        System.out.println(Arrays.toString(r));


    }
}
