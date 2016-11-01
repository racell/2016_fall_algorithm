package divideAndConquer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-11-02.
 */
public class CountingInversionsTest {
    public static void main(String[] args) throws IOException {
        CountingInversions countingInversions = new CountingInversions();
        FileManager fileManager = new FileManager();
        Inversion result = countingInversions.sortAndCount(fileManager.readFileForCountingInversions());

        System.out.println("Inversion count : " + result.getCount());
        System.out.println(result.getArrayList());
    }
}
