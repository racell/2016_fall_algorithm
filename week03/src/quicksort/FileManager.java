package quicksort;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-10-05.
 */
public class FileManager {
    public ArrayList<Integer> readFile() throws IOException {
        Scanner scanner = new Scanner(new File("week03/src/quicksort/data04.txt"));
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

    public void writeFile(ArrayList<Integer> outputArray, String filename) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("week03/src/quicksort/" + filename));
        fileOutputStream.close();
        FileWriter fileWriter = new FileWriter(new File("week03/src/quicksort/" + filename));
        StringBuilder stringBuilder = new StringBuilder();
        while(!outputArray.isEmpty()) {
            stringBuilder.append(outputArray.remove(0));
            stringBuilder.append(",");
        }
        fileWriter.write(stringBuilder.deleteCharAt(stringBuilder.length()-1).toString());
        fileWriter.close();
    }
}
