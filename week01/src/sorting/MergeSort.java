package sorting;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-19.
 */
public class MergeSort {

    public void doMergeSort(ArrayList<Integer> array) {
        if (array.size() > 1) {
            ArrayList<Integer> first = new ArrayList<>(array.subList(0, array.size() / 2));
            ArrayList<Integer> second = new ArrayList<>(array.subList(array.size()/2, array.size()));

            doMergeSort(first);
            doMergeSort(second);

            doMerge(array,first,second);
        }
    }

    public void doMerge(ArrayList<Integer> result, ArrayList<Integer> first, ArrayList<Integer> second) {
        int firstIndex = 0;
        int secondIndex = 0;

        for(int i=0; i < result.size(); i++) {
            if(secondIndex >= second.size() || (firstIndex < first.size() && first.get(firstIndex) <= second.get(secondIndex))) {
                result.set(i, first.get(firstIndex));
                firstIndex++;
            }
            else {
                result.set(i, second.get(secondIndex));
                secondIndex++;
            }
        }
    }
}
