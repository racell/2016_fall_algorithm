package sorting;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class SortingTest {

    public static void main(String[] args) throws IOException {
        FileManger fileManger = new FileManger("data02.txt", "result.txt");
        BinaryInsertion binaryInsertion = new BinaryInsertion(fileManger.readFile());
        binaryInsertion.doInsertionSort();
        fileManger.writeFile(binaryInsertion.getArray());
    }
}
