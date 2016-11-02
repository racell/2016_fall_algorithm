package divideAndConquer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-11-02.
 */
public class FileManager {
    public ArrayList<Integer> readFileForCountingInversions() throws IOException {
        Scanner scanner = new Scanner(new File("week06/src/divideAndConquer/data07_inversion.txt"));
        ArrayList<Integer> inputArray = new ArrayList<>();

        while(scanner.hasNext()) {
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), ",");
            while(stringTokenizer.hasMoreTokens()) {
                inputArray.add(Integer.parseInt(stringTokenizer.nextToken()));
            }
        }
        scanner.close();
        return inputArray;
    }

    public ArrayList<Point> readFileForClosestPair() throws IOException {
        Scanner scanner = new Scanner(new File("week06/src/divideAndConquer/data07_closest.txt"));
        ArrayList<Point> inputArray = new ArrayList<>();

        while(scanner.hasNext()) {
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), ",");
            while(stringTokenizer.hasMoreTokens()) {
                inputArray.add(new Point(Double.parseDouble(stringTokenizer.nextToken()), Double.parseDouble(stringTokenizer.nextToken())));
            }
        }
        scanner.close();
        return inputArray;
    }
}
