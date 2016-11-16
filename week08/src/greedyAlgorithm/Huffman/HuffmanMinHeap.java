package greedyAlgorithm.Huffman;

/**
 * Created by SeongJung on 2016-11-16.
 */
public class HuffmanMinHeap {
    private HuffmanNode[] nodes;
    private int heapSize;

    public HuffmanMinHeap() {
        this.nodes = new HuffmanNode[65];
        this.heapSize = 0;
    }

    private void MIN_HEAPIFY(HuffmanNode[] nodes, int index) {
        int leftChild = 2*index;
        int rightChild = 2*index+1;
        int smallest;

        if (leftChild <= heapSize && nodes[leftChild].getFreq() < nodes[index].getFreq()) {
            smallest = leftChild;
        }
        else {
            smallest = index;
        }

        if (rightChild <= heapSize && nodes[rightChild].getFreq() < nodes[smallest].getFreq()) {
            smallest = rightChild;
        }

        if (smallest != index) {
            HuffmanNode temp = nodes[index];
            nodes[index] = nodes[smallest];
            nodes[smallest] = temp;

            MIN_HEAPIFY(nodes, smallest);
        }
    }

    public void BUILD_MIN_HEAP(HuffmanNode[] nodes) {
        for (int i = this.heapSize/2; i >= 1; i--) {
            MIN_HEAPIFY(nodes, i);
        }
    }

    public HuffmanNode[] getNodes() {
        return this.nodes;
    }

    public int getHeapSize() {
        return this.heapSize;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }
}
