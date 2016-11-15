package greedyAlgorithm;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class Node {
    private int vertex;
    private int shortestPath;
    private int preVertex;
    private char name;

    public Node(int vertex, int shortestPath, int preVertex, char name) {
        this.vertex = vertex;
        this.shortestPath = shortestPath;
        this.preVertex = preVertex;
        this.name = name;
    }

    public int getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(int shortestPath) {
        this.shortestPath = shortestPath;
    }

    public void setPreVertex(int preVertex) {
        this.preVertex = preVertex;
    }

    public int getPreVertex() {
        return preVertex;
    }

    public int getVertex() {
        return vertex;
    }
}
