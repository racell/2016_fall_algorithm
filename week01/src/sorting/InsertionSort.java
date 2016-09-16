package sorting;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class InsertionSort {
    private int[] array;
    private int length;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void doInsertionSort() {
        for (int i = 1; i < array.length; i++) {
            int key = this.array[i];
            int j = i - 1;

            while (j >= 0 && this.array[j] > key) {
                this.array[j+1] = this.array[j];
                j = j - 1;
            }
            this.array[j+1] = key;
        }
    }

    public void printResult() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i]);
        }
    }
}
