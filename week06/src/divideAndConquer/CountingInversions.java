package divideAndConquer;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-11-01.
 */
public class CountingInversions {
    public Inversion sortAndCount(ArrayList<Integer> inputArray) {
        if (inputArray.size() == 1) {
            return new Inversion(0, inputArray);
        }

        Inversion first = sortAndCount(new ArrayList<>(inputArray.subList(0, inputArray.size()/2)));
        Inversion second = sortAndCount(new ArrayList<>(inputArray.subList(inputArray.size()/2, inputArray.size())));
        Inversion merge = mergeAndCount(first.getArrayList(), second.getArrayList());

        return new Inversion(first.getCount() + second.getCount() + merge.getCount(), merge.getArrayList());
    }

    private Inversion mergeAndCount(ArrayList<Integer> first, ArrayList<Integer> second) {
        int inversion_count = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (first.size() != 0 && second.size() != 0) {
            if (first.get(0) > second.get(0)) {
                inversion_count = inversion_count + first.size();
                result.add(second.remove(0));
            }
            else {
                result.add(first.remove(0));
            }
        }

        while (!first.isEmpty()) {
            result.add(first.remove(0));
        }

        while (!second.isEmpty()) {
            result.add(second.remove(0));
        }

        return new Inversion(inversion_count, result);
    }
}
