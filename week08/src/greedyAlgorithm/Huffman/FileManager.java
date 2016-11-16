package greedyAlgorithm.Huffman;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SeongJung on 2016-11-16.
 */
public class FileManager {
    public ArrayList<HuffmanNode> readStringFileToArrayList() throws IOException {
        Scanner scanner = new Scanner(new File("week08/src/greedyAlgorithm/Huffman/data10.txt"));
        String input = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), 1);
            } else {
                map.replace(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }

        ArrayList<HuffmanNode> nodes = new ArrayList<>();

        for (char key : map.keySet()) {
            nodes.add(new HuffmanNode(key, (map.get(key)*100/input.length())));
        }

        return nodes;
    }

    public String readStringFileToString() throws IOException {
        Scanner scanner = new Scanner(new File("week08/src/greedyAlgorithm/Huffman/data10.txt"));
        return scanner.nextLine();
    }

    public void readEncodedFile() throws IOException {

    }

    public void writeTableFile(HashMap<Character, String> huffmanTable) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("week08/src/greedyAlgorithm/Huffman/hw08_00_201202135_table.txt"));
        fileOutputStream.close();
        FileWriter fileWriter = new FileWriter(new File("week08/src/greedyAlgorithm/Huffman/hw08_00_201202135_table.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        for (char key : huffmanTable.keySet()) {
            stringBuilder.append(key + "," + huffmanTable.get(key) + "\n");
        }
        fileWriter.write(stringBuilder.deleteCharAt(stringBuilder.length()-1).toString());
        fileWriter.close();
    }

    public void writeEncodedFile(StringBuilder stringBuilder) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("week08/src/greedyAlgorithm/Huffman/hw08_00_201202135_encoded.txt"));
        fileOutputStream.close();
        FileWriter fileWriter = new FileWriter(new File("week08/src/greedyAlgorithm/Huffman/hw08_00_201202135_encoded.txt"));
        fileWriter.write(stringBuilder.toString());
        fileWriter.close();
    }
}
