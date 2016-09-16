package sorting;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class InsertionSort {
    private ArrayList<Integer> array;

    public InsertionSort(ArrayList<Integer> array) {
        this.array = array;
    }

    public void doInsertionSort() {
        for (int i = 1; i < array.size(); i++) {
            int key = this.array.get(i);
            int j = i - 1;

            while (j >= 0 && this.array.get(j) > key) {
                this.array.set(j+1, this.array.get(j));
                j = j - 1;
            }
            this.array.set(j+1, key);
        }
    }

    public void printResult() {
        System.out.println(this.array.toString());
    }
}
