package Dijkstra;

/**
 * Created by SeongJung on 2016-11-09.
 */
public class Dijkstra {
    private int[] distanceVector;
    private int vectorSize;
    private final int inf = Integer.MAX_VALUE;

    public Dijkstra(int node) {
        this.vectorSize = node;
        this.distanceVector = new int[this.vectorSize];
    }

    public int[] shortestPath(int[][] weight, int v) {
        MinPriorityQueue minPriorityQueue = new MinPriorityQueue(new MinHeap());
        for (int i = 0; i < this.vectorSize; i++) {
            if (i == v) {
                this.distanceVector[i] = 0;
            } else {
                this.distanceVector[i] = inf;
            }
            minPriorityQueue.insert(new Node(i, this.distanceVector[i], 0));
        }

        while (!minPriorityQueue.isEmpty()) {
            Node min = minPriorityQueue.min();
            minPriorityQueue.extract_min();
            for (int i = 0; i < distanceVector.length; i++) {
                if (i == min.getVertex()) {
                    continue;
                }
                if (weight[min.getVertex()][i] != 0) {
                    int newDistance = distanceVector[min.getVertex()] + weight[min.getVertex()][i];
                    if (newDistance < distanceVector[i]) {
                        distanceVector[i] = newDistance;
                        minPriorityQueue.updatedistance(i, newDistance, min.getVertex());
                    }
                }
            }
        }

        return distanceVector;
    }
}
