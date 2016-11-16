package greedyAlgorithm.Huffman;

import java.io.IOException;

/**
 * Created by SeongJung on 2016-11-16.
 */
public class HuffmanTest {
    public static void main(String[] args) throws IOException {
        Huffman huffman = new Huffman();
        FileManager fileManager = new FileManager();
        huffman.buildTable(huffman.buildTree(fileManager.readStringFileToArrayList()));
        fileManager.writeTableFile(huffman.getMap());
        fileManager.writeEncodedFile(huffman.huffmanEncoding(fileManager.readStringFileToString()));
        fileManager.writeDecodedFile(huffman.huffmanDecoding(fileManager.readEncodedFile(), fileManager.readHuffmanTableFile()));
    }
}
