package mergeSort;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-19.
 */
public class MergeSort {
    private ArrayList<Integer> array;
    private int mergeCount;

    public MergeSort(ArrayList<Integer> array) {
        this.array = array;
        this.mergeCount = 0;
    }

    public void doMergeSort(ArrayList<Integer> array) {
        if (array.size() > 1) {
            ArrayList<Integer> first = new ArrayList<>(array.subList(0, array.size() / 2));
            ArrayList<Integer> second = new ArrayList<>(array.subList(array.size()/2, array.size()));

            doMergeSort(first);
            doMergeSort(second);

            doMerge(array,first,second);
            this.mergeCount++;
        }
    }

    private void doMerge(ArrayList<Integer> result, ArrayList<Integer> first, ArrayList<Integer> second) {
        int firstIndex = 0;
        int secondIndex = 0;
        int resultIndex = 0;

        while (firstIndex < first.size() && secondIndex < second.size()) {
            if (first.get(firstIndex) < second.get(secondIndex)) {
                result.set(resultIndex, first.get(firstIndex));
                firstIndex++;
                resultIndex++;
            }
            else {
                result.set(resultIndex, second.get(secondIndex));
                secondIndex++;
                resultIndex++;
            }
        }

        while (firstIndex < first.size()) {
            result.set(resultIndex, first.get(firstIndex));
            firstIndex++;
            resultIndex++;
        }

        while (secondIndex < second.size()) {
            result.set(resultIndex, second.get(secondIndex));
            secondIndex++;
            resultIndex++;
        }
    }

    public ArrayList<Integer> getArray() {
        return this.array;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }
}
