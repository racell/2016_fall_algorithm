package insertionSort;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class SortingTest {

    public static void main(String[] args) throws IOException {
        long start, end;

        FileManager fileManger = new FileManager("data02.txt", "hw02_00_201202135_insertion.txt");
        InsertionSort insertionSort = new InsertionSort(fileManger.readFile());
        start = System.nanoTime();
        insertionSort.doInsertionSort();
        end = System.nanoTime();
        System.out.println("insertion time : " + ((end - start) / 1000d) + " mirosecond");
        fileManger.writeFile(insertionSort.getArray());

        fileManger.setOutputFileName("hw02_00_201202135_binary_insertion.txt");
        BinaryInsertionSort binaryInsertion = new BinaryInsertionSort(fileManger.readFile());
        start = System.nanoTime();
        binaryInsertion.doInsertionSort();
        end = System.nanoTime();
        System.out.println("binary_insertion time : " + ((end - start) / 1000d) + " microsecond");
        fileManger.writeFile(binaryInsertion.getArray());
    }
}
