package greedyAlgorithm;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class Node {
    private int vertex;
    private int path;
    private String name;


    public Node(int vertex, int path, String name) {
        this.vertex = vertex;
        this.path = path;
        this.name = name;
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
