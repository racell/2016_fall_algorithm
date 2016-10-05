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

    public void randomizedQuickSort(ArrayList<Integer> arrayList, int left, int right) {
        if (left < right) {
            int index = randomizedPartition(arrayList, left, right);
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

    private int randomizedPartition(ArrayList<Integer> arrayList, int left, int right) {
        int index = 0;
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i] = (int) (Math.random() * (right - left + 1)) + left;
        }

        if (temp[0] > temp[1] && temp[0] < temp[2] || temp[0] < temp[1] && temp[0] > temp[2]) {
            index = temp[0];
        }
        else if (temp[1] > temp[0] && temp[1] < temp[2] || temp[1] < temp[0] && temp[2] > temp[0]) {
            index = temp[1];
        }
        else {
            index = temp[2];
        }

        int middle = arrayList.get(index);
        arrayList.set(index, arrayList.get(right));
        arrayList.set(right, middle);

        return partition(arrayList, left, right);
    }
}
