package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] massive) {
        this.array = massive;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(arr);
        reduce.print();
    }
}
