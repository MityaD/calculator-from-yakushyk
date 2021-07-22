package com.company.Stepik;

public class MethodConcatenateTwoArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (c1 == a1.length || (c2 != a2.length && a1[c1] > a2[c2])) {
                arr[i] = a2[c2];
                c2++;
            } else {
                arr[i] = a1[c1];
                c1++;
            }
        }
        return arr;
    }
}
