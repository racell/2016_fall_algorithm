package maxPQ;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-09-26.
 */
public class FileManager {

    public Node[] readFile() throws IOException {
        Scanner scanner = new Scanner(new File("week02/src/maxPQ/data03.txt"));
        Node[] nodes = new Node[65];

        for (int i = 0; scanner.hasNext(); i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), ",");
            while(stringTokenizer.hasMoreTokens()) {
                nodes[i] = new Node(Integer.parseInt(stringTokenizer.nextToken()), stringTokenizer.nextToken());
            }
        }
        scanner.close();
        return nodes;
    }
}
