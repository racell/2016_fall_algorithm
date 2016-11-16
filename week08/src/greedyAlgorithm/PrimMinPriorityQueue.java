package greedyAlgorithm;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class PrimMinPriorityQueue {
    private PrimMinHeap minHeap;
    private PrimNode[] nodes;
    private int heapSize;

    public PrimMinPriorityQueue(PrimMinHeap minHeap) {
        this.minHeap = minHeap;
        this.nodes = minHeap.getNodes();
        this.heapSize = minHeap.getHeapSize();
    }

    public void insert(PrimNode newNode) {
        this.nodes[++this.heapSize] = newNode;
        this.minHeap.setHeapSize(this.heapSize);
        this.minHeap.BUILD_MIN_HEAP(this.nodes);
    }

    public PrimNode min() {
        return this.nodes[1];
    }

    public void extract_min() {
        this.nodes[1] = this.nodes[this.heapSize--];
        this.minHeap.setHeapSize(this.heapSize);
        this.minHeap.BUILD_MIN_HEAP(this.nodes);
    }

    public void updateDistance(int index, int path) {
        for (int i = 1; i <= heapSize; i++) {
            if (index == nodes[i].getVertex()) {
                nodes[i].setPath(path);
                this.minHeap.BUILD_MIN_HEAP(this.nodes);
                return;
            }
        }
    }

    public boolean hasVertex(int index) {
        for (int i = 1; i <= heapSize; i++) {
            if (index == nodes[i].getVertex()) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.heapSize == 0;
    }

    public int size() {
        return this.heapSize;
    }
}
