package divideAndConquer;

import java.io.IOException;

/**
 * Created by SeongJung on 2016-11-02.
 */
public class ClosestPairTest {
    public static void main(String[] args) throws IOException {
        ClosestPair closestPair = new ClosestPair();
        FileManager fileManager = new FileManager();
        double result = closestPair.closestPair(fileManager.readFileForClosestPair());

        System.out.printf("closest pair : %.3f", result);
    }
}
