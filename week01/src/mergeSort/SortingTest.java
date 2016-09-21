package mergeSort;

import java.io.IOException;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class SortingTest {

    public static void main(String[] args) throws IOException {
        long start, end;
        FileManager fileManger = new FileManager("data02.txt", "hw02_00_201202135_merge.txt");
        MergeSort mergeSort = new MergeSort(fileManger.readFile());
        start = System.nanoTime();
        mergeSort.doMergeSort(mergeSort.getArray());
        end = System.nanoTime();
        System.out.println("merge time : " + ((end - start) / 1000d) + " microsecond");
        fileManger.writeFile(mergeSort.getArray(), mergeSort.getMergeCount());

        fileManger.setOutputFileName("hw02_00_201202135_3way_merge.txt");
        ThreeWayMergeSort threeWayMergeSort = new ThreeWayMergeSort(fileManger.readFile());
        start = System.nanoTime();
        threeWayMergeSort.doMergeSort(threeWayMergeSort.getArray());
        end = System.nanoTime();
        System.out.println("3 way merge time : " + ((end - start) / 1000d) + " microsecond");
        fileManger.writeFile(threeWayMergeSort.getArray(), threeWayMergeSort.getMergeCount());
    }
}
