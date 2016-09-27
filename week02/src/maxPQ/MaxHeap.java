package maxPQ;

/**
 * Created by SeongJung on 2016-09-26.
 */
public class MaxHeap {
    private Node[] nodes;
    private int heapSize;

    public MaxHeap(int heapSize) {
        this.nodes = new Node[65];
        this.heapSize = heapSize;
    }

    private void MAX_HEAPIFY(Node[] nodes, int index) {
        int leftChild = 2*index;
        int rightChild = 2*index+1;
        int largest = index;

        if (leftChild <= heapSize && nodes[leftChild].getPriority() > nodes[index].getPriority()) {
            largest = leftChild;
        }
        else {
            largest = index;
        }

        if (rightChild <= heapSize && nodes[rightChild].getPriority() > nodes[largest].getPriority()) {
            largest = rightChild;
        }

        if (largest != index) {
            Node temp = nodes[index];
            nodes[index] = nodes[largest];
            nodes[largest] = temp;

            MAX_HEAPIFY(nodes, largest);
        }
    }

    public void BUILD_MAX_HEAP(Node[] nodes) {
        for (int i = this.heapSize; i >= 1; i--) {
            MAX_HEAPIFY(nodes, i);
        }
    }
}
