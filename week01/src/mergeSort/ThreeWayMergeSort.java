package mergeSort;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-21.
 */
public class ThreeWayMergeSort {
    private ArrayList<Integer> array;
    private int mergeCount;

    public ThreeWayMergeSort(ArrayList<Integer> array) {
        this.array = array;
        this.mergeCount = 0;
    }

    public void doMergeSort(ArrayList<Integer> array) {
        if (array.size() > 2) {
            ArrayList<Integer> first = new ArrayList<>(array.subList(0, array.size() / 3));
            ArrayList<Integer> second = new ArrayList<>(array.subList(array.size() / 3, (array.size() / 3) * 2));
            ArrayList<Integer> third = new ArrayList<>(array.subList((array.size() / 3) * 2, array.size()));

            doMergeSort(first);
            doMergeSort(second);
            doMergeSort(third);

            doMerge(array,first,second,third);
            this.mergeCount++;
        }
        else if (array.size() == 2) {
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

    private void doMerge(ArrayList<Integer> result, ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> third) {
        int firstIndex = 0;
        int secondIndex = 0;
        int thirdIndex = 0;
        int resultIndex = 0;

        while (firstIndex < first.size() && secondIndex < second.size() && thirdIndex < third.size()) {
            if (first.get(firstIndex) < second.get(secondIndex)) {
                if (first.get(firstIndex) < third.get(thirdIndex)) {
                    result.set(resultIndex, first.get(firstIndex));
                    firstIndex++;
                    resultIndex++;
                }
                else{
                    result.set(resultIndex, third.get(thirdIndex));
                    thirdIndex++;
                    resultIndex++;
                }
            }
            else {
                if (second.get(secondIndex) < third.get(thirdIndex)) {
                    result.set(resultIndex, second.get(secondIndex));
                    secondIndex++;
                    resultIndex++;
                }
                else {
                    result.set(resultIndex, third.get(thirdIndex));
                    thirdIndex++;
                    resultIndex++;
                }
            }
        }

        if (firstIndex == first.size()) {
            while (secondIndex < second.size() && thirdIndex < third.size()) {
                if (second.get(secondIndex) < third.get(thirdIndex)) {
                    result.set(resultIndex, second.get(secondIndex));
                    secondIndex++;
                    resultIndex++;
                }
                else {
                    result.set(resultIndex, third.get(thirdIndex));
                    thirdIndex++;
                    resultIndex++;
                }
            }
        }
        else if (secondIndex == second.size()) {
            while (firstIndex < first.size() && thirdIndex < third.size()) {
                if (first.get(firstIndex) < third.get(thirdIndex)) {
                    result.set(resultIndex, first.get(firstIndex));
                    firstIndex++;
                    resultIndex++;
                }
                else {
                    result.set(resultIndex, third.get(thirdIndex));
                    thirdIndex++;
                    resultIndex++;
                }
            }
        }
        else if (thirdIndex == third.size()) {
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

        while (thirdIndex < third.size()) {
            result.set(resultIndex, third.get(thirdIndex));
            thirdIndex++;
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
