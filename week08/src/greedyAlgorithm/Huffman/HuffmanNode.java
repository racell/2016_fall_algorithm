package greedyAlgorithm.Huffman;

/**
 * Created by SeongJung on 2016-11-16.
 */
public class HuffmanNode {
    private char key;
    private int freq;
    private HuffmanNode left;
    private HuffmanNode right;
    private String code;

    public HuffmanNode() {
        this.key = '\0';
        this.freq = 0;
        this.left = null;
        this.right = null;
        this.code = "";
    }

    public HuffmanNode(char key, int freq) {
        this.key = key;
        this.freq = freq;
        this.left = null;
        this.right = null;
        this.code = "";
    }

    public char getKey() {
        return key;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public void setLeft(HuffmanNode left) {
        this.left = left;
    }

    public void setRight(HuffmanNode right) {
        this.right = right;
    }

    public HuffmanNode getLeft() {
        return left;
    }

    public HuffmanNode getRight() {
        return right;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
