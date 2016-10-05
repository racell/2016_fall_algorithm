package quicksort;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-10-05.
 */
public class TestQuicksort {
    public static void main(String[] args) throws IOException {
        FileManager fileManager = new FileManager();
        ArrayList<Integer> arrayList = fileManager.readFile();
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arrayList,0,arrayList.size()-1);
        fileManager.writeFile(arrayList, "outputNormal.txt");


        arrayList = fileManager.readFile();
        quickSort.randomizedQuickSort(arrayList, 0, arrayList.size()-1);
        fileManager.writeFile(arrayList, "outputRandom.txt");
    }
}
