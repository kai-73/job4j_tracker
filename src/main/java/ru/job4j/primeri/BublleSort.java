package ru.job4j.primeri;

import java.util.Arrays;

public class BublleSort {
    public static void main(String[] args) {
        int[] a = {10, 1, 50, 6, 3, 7, 18, 0, 100, 15};
        for (int barrier = 0; barrier < a.length - 2; barrier++) {
            for (int i = 0; i < a.length - 1  - barrier; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }  

        }
        System.out.println(Arrays.toString(a));
    }
}
