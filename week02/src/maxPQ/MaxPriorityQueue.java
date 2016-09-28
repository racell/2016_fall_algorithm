package maxPQ;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class MaxPriorityQueue {
    private MaxHeap maxHeap;
    private Node[] nodes;
    private int heapSize;

    public MaxPriorityQueue(MaxHeap maxHeap) {
        this.maxHeap = maxHeap;
        this.nodes = maxHeap.getNodes();
        this.heapSize = maxHeap.getHeapSize();
    }

    public void insert(Node newNode) {
        this.nodes[++this.heapSize] = newNode;
        this.maxHeap.setHeapSize(this.heapSize);
        this.maxHeap.BUILD_MAX_HEAP(this.nodes);
    }

    public Node max() {
        return this.nodes[1];
    }

    public void extract_max() {
        this.nodes[1] = this.nodes[this.heapSize--];
        this.maxHeap.setHeapSize(this.heapSize);
        this.maxHeap.BUILD_MAX_HEAP(this.nodes);
    }

    public void increase_key(int index, int key) {
        this.nodes[index].setPriority(key);
        this.maxHeap.BUILD_MAX_HEAP(this.nodes);
    }

    public void h_delete(int index) {
        this.nodes[index] = this.nodes[this.heapSize--];
        this.maxHeap.setHeapSize(this.heapSize);
        this.maxHeap.BUILD_MAX_HEAP(this.nodes);
    }
}
