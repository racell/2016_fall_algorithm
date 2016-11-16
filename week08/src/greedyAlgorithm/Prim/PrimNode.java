package greedyAlgorithm.Prim;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class PrimNode {
    private int vertex;
    private int path;

    public PrimNode(int vertex, int path) {
        this.vertex = vertex;
        this.path = path;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public int getVertex() {
        return vertex;
    }
}
