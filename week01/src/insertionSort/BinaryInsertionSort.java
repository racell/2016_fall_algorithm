package insertionSort;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class BinaryInsertionSort {
    private ArrayList<Integer> array;

    public BinaryInsertionSort(ArrayList<Integer> array) {
        this.array = array;
    }

    public void doInsertionSort() {
        for (int i = 1; i < this.array.size(); i++) {
            int key = this.array.get(i);
            int j = i - 1;

            int location = binarySearch(this.array, key, j);

            while (j >= location) {
                this.array.set(j+1, this.array.get(j));
                j = j - 1;
            }
            this.array.set(j+1, key);
        }
    }

    public int binarySearch(ArrayList<Integer> array, int key, int n) {
        int begin = 0;
        int end = n;
        if (key <= array.get(begin)) {
            return begin;
        }
        else if (key > array.get(end)) {
            return end+1;
        }
        else {
            while (begin != end) {
                int mid = (begin + end) / 2;
                if(array.get(mid) < key) {
                    begin = mid + 1;
                }
                else {
                    end = mid;
                }
            }
            return begin;
        }
    }

    public ArrayList<Integer> getArray() {
        return this.array;
    }

}
