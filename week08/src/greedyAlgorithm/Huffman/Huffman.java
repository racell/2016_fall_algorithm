package greedyAlgorithm.Huffman;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SeongJung on 2016-11-16.
 */
public class Huffman {
    private HashMap<Character, String> map;

    public Huffman() {
        this.map = new HashMap<>();
    }

    public HuffmanNode buildTree(ArrayList<HuffmanNode> nodes) {
        HuffmanMinPriorityQueue huffmanMinPriorityQueue = new HuffmanMinPriorityQueue(new HuffmanMinHeap());
        for (int i = 0; i < nodes.size(); i++) {
            huffmanMinPriorityQueue.insert(nodes.get(i));
        }
        for (int i = 1; i < nodes.size(); i++) {
            HuffmanNode newNode = new HuffmanNode();
            HuffmanNode first = huffmanMinPriorityQueue.min();
            huffmanMinPriorityQueue.extract_min();
            HuffmanNode second = huffmanMinPriorityQueue.min();
            huffmanMinPriorityQueue.extract_min();

            newNode.setLeft(first);
            newNode.setRight(second);
            newNode.setFreq(first.getFreq() + second.getFreq());
            huffmanMinPriorityQueue.insert(newNode);
        }
        HuffmanNode result = huffmanMinPriorityQueue.min();
        huffmanMinPriorityQueue.extract_min();
        return result;
    }

    public void buildTable(HuffmanNode node) {
        if (node.getLeft() == null && node.getRight() == null) {
            map.put(node.getKey(), node.getCode());
            return;
        }
        node.getLeft().setCode(node.getCode() + "0");
        node.getRight().setCode(node.getCode() + "1");
        buildTable(node.getLeft());
        buildTable(node.getRight());
    }

    public StringBuilder huffmanEncoding(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            stringBuilder.append(this.map.get(input.charAt(i)));
        }
        return stringBuilder;
    }

    public StringBuilder huffmanDecoding(String encodedText, HashMap<String, Character> map) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        while (!encodedText.isEmpty()) {
            String temp = encodedText.substring(0,i);
            String rest = encodedText.substring(i);
            if (map.containsKey(temp)) {
                stringBuilder.append(map.get(temp));
                encodedText = rest;
                i = 1;
            }
            i++;
        }
        return stringBuilder;
    }

    public HashMap<Character, String> getMap() {
        return map;
    }
}
