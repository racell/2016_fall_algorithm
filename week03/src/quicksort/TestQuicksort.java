package quicksort;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-10-05.
 */
public class TestQuicksort {
    public static void main(String[] args) throws IOException {
        long start, end;
        for (int i = 0; i < 10; i++) {
            FileManager fileManager = new FileManager();
            ArrayList<Integer> arrayList = fileManager.readFile();
            QuickSort quickSort = new QuickSort();
            start = System.nanoTime();
            quickSort.quickSort(arrayList, 0, arrayList.size() - 1);
            end = System.nanoTime();
            System.out.println("normal quick sort : " + ((end - start) / 1000d) + " microsecond");
            fileManager.writeFile(arrayList, "outputNormal.txt");

            arrayList = fileManager.readFile();
            start = System.nanoTime();
            quickSort.randomizedQuickSort(arrayList, 0, arrayList.size() - 1);
            end = System.nanoTime();
            System.out.println("randomize quick sort : " + ((end - start) / 1000d) + " microsecond");
            fileManager.writeFile(arrayList, "outputRandom.txt");
        }
    }
}
