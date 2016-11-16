package greedyAlgorithm;

/**
 * Created by SeongJung on 2016-11-16.
 */
public class HuffmanNode {
    private String key;
    private int freq;
    private HuffmanNode left;
    private HuffmanNode right;

    public HuffmanNode() {
        this.key = "";
        this.freq = 0;
        this.left = null;
        this.right = null;
    }

    public HuffmanNode(String key, int freq) {
        this.key = key;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
}
