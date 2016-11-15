package greedyAlgorithm;

/**
 * Created by SeongJung on 2016-11-15.
 */
public class Prim {
    private int[] distance;
    private int[] parent;
    private int vectorSize;
    private final int inf = Integer.MAX_VALUE;

    public Prim(int node) {
        this.vectorSize = node;
        this.distance = new int[this.vectorSize];
        this.parent = new int[this.vectorSize];
    }

    public int[] shortestPath(int[][] weight, int v) {
        MinPriorityQueue minPriorityQueue = new MinPriorityQueue(new MinHeap());
        for (int i = 0; i < this.vectorSize; i++) {
            if (i == v) {
                this.distance[i] = 0;
            } else {
                this.distance[i] = inf;
            }
            minPriorityQueue.insert(new Node(i, this.distance[i], ""));
        }

        while (!minPriorityQueue.isEmpty()) {
            Node min = minPriorityQueue.min();
            minPriorityQueue.extract_min();
            for (int i = 0; i < weight[min.getVertex()].length; i++) {
                if (weight[min.getVertex()][i] != 0 && minPriorityQueue.hasVertex(i) && weight[min.getVertex()][i] < distance[i]) {
                    distance[i] = weight[min.getVertex()][i];
                    parent[i] = min.getVertex();
                    minPriorityQueue.updateDistance(i, distance[i]);
                }
            }
        }

        return distance;
    }

    public int[] getParent() {
        return this.getParent();
    }
}
