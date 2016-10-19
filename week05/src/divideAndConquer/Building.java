package divideAndConquer;

/**
 * Created by SeongJung on 2016-10-19.
 */
public class Building {
    private int left;
    private int right;
    private int height;

    public Building(int left, int height, int right) {
        this.left = left;
        this.right = right;
        this.height = height;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getHeight() {
        return height;
    }
}
