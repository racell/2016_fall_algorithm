package greedyAlgorithm;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class MinPriorityQueue {
    private MinHeap minHeap;
    private Node[] nodes;
    private int heapSize;

    public MinPriorityQueue(MinHeap minHeap) {
        this.minHeap = minHeap;
        this.nodes = minHeap.getNodes();
        this.heapSize = minHeap.getHeapSize();
    }

    public void insert(Node newNode) {
        this.nodes[++this.heapSize] = newNode;
        this.minHeap.setHeapSize(this.heapSize);
        this.minHeap.BUILD_MIN_HEAP(this.nodes);
    }

    public Node min() {
        return this.nodes[1];
    }

    public void extract_min() {
        this.nodes[1] = this.nodes[this.heapSize--];
        this.minHeap.setHeapSize(this.heapSize);
        this.minHeap.BUILD_MIN_HEAP(this.nodes);
    }

    public void updatedistance(int index, int path, int preVertex) {
        for (int i = 1; i <= heapSize; i++) {
            if (index == nodes[i].getVertex()) {
                nodes[i].setShortestPath(path);
                nodes[i].setPreVertex(preVertex);
                this.minHeap.BUILD_MIN_HEAP(this.nodes);
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.heapSize == 0;
    }

    public int size() {
        return this.heapSize;
    }
}
