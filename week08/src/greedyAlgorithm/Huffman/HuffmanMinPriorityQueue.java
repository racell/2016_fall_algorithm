package greedyAlgorithm.Huffman;

/**
 * Created by SeongJung on 2016-11-16.
 */
public class HuffmanMinPriorityQueue {
    private HuffmanMinHeap minHeap;
    private HuffmanNode[] nodes;
    private int heapSize;

    public HuffmanMinPriorityQueue(HuffmanMinHeap minHeap) {
        this.minHeap = minHeap;
        this.nodes = minHeap.getNodes();
        this.heapSize = minHeap.getHeapSize();
    }

    public void insert(HuffmanNode newNode) {
        this.nodes[++this.heapSize] = newNode;
        this.minHeap.setHeapSize(this.heapSize);
        this.minHeap.BUILD_MIN_HEAP(this.nodes);
    }

    public HuffmanNode min() {
        return this.nodes[1];
    }

    public void extract_min() {
        this.nodes[1] = this.nodes[this.heapSize--];
        this.minHeap.setHeapSize(this.heapSize);
        this.minHeap.BUILD_MIN_HEAP(this.nodes);
    }

    public boolean isEmpty() {
        return this.heapSize == 0;
    }

    public int size() {
        return this.heapSize;
    }
}
