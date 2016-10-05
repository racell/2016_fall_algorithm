package quicksort;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-10-02.
 */
public class QuickSort {
    public void quickSort(ArrayList<Integer> arrayList, int left, int right) {
        if (left < right) {
            int index = partition(arrayList, left, right);
            quickSort(arrayList, left, index-1);
            quickSort(arrayList, index+1, right);
        }
    }

    private int partition(ArrayList<Integer> arrayList, int left, int right) {
        int value = arrayList.get(right);
        int index = left - 1;

        for (int i = left; i < right; i++) {
            if (arrayList.get(i) < value) {
                index++;
                int temp = arrayList.get(index);
                arrayList.set(index, arrayList.get(i));
                arrayList.set(i, temp);
            }
        }
        index++;
        int temp = arrayList.get(index);
        arrayList.set(index, arrayList.get(right));
        arrayList.set(right, temp);

        return index;
    }
}
