package Dijkstra;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class Node {
    private int vertex;
    private int shortestPath;
    private int preVertex;

    public Node(int vertex, int shortestPath, int preVertex) {
        this.vertex = vertex;
        this.shortestPath = shortestPath;
        this.preVertex = preVertex;
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
