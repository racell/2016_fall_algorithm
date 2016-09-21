package insertionSort;

import java.io.IOException;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class SortingTest {

    public static void main(String[] args) throws IOException {
        long start, end;

        FileManger fileManger = new FileManger("data02", "hw02_00_201202135_insertion.txt");
        InsertionSort insertionSort = new InsertionSort(fileManger.readFile());
        start = System.nanoTime();
        insertionSort.doInsertionSort();
        end = System.nanoTime();
        System.out.println("insertion time : " + ((end - start) / 1000d) + "ms");
        fileManger.writeFile(insertionSort.getArray());

        fileManger.setOutputFileName("hw02_00_201202135_binary_insertion.txt");
        BinaryInsertionSort binaryInsertion = new BinaryInsertionSort(fileManger.readFile());
        start = System.nanoTime();
        binaryInsertion.doInsertionSort();
        end = System.nanoTime();
        System.out.println("binary_insertion time : " + ((end - start) / 1000d) + "ms");
        fileManger.writeFile(binaryInsertion.getArray());
    }
}
