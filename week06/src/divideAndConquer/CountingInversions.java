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
        Inversion merge = mergeAndCount(first, second);

        return new Inversion(first.getCount() + second.getCount() + merge.getCount(), merge.getArrayList());
    }

    private Inversion mergeAndCount(Inversion first, Inversion second) {
        int inversion_count = 0;
        int firstIndex = 0, secondIndex = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (firstIndex < first.getArrayList().size() && secondIndex < second.getArrayList().size()) {
            if (first.getArrayList().get(firstIndex) < second.getArrayList().get(secondIndex)) {
                inversion_count = inversion_count + second.getCount();
                result.add(first.getArrayList().get(firstIndex++));
            }
            else {
                result.add(second.getArrayList().get(secondIndex++));
            }
        }

        while (firstIndex < first.getArrayList().size()) {
            result.add(first.getArrayList().get(firstIndex++));
        }

        while (secondIndex < second.getArrayList().size()) {
            result.add(second.getArrayList().get(secondIndex++));
        }

        return new Inversion(inversion_count, result);
    }
}
