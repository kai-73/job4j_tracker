package ru.job4j.primeri;

import java.util.Arrays;

public class InversArray {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int k = a.length / 2; k >= 0; k--) {
                    int tmp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = tmp;
                }
        System.out.println(Arrays.toString(a));
    }
}
