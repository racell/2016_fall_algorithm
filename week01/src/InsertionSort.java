import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-09-16.
 */
public class InsertionSort {
    private ArrayList<Integer> array;
    private int length;

    public InsertionSort(ArrayList<Integer> array) {
        this.array = array;
        this.length = array.size();
    }

    public void insertionSort() {
        for (int i = 1; i < this.length; i++) {
            int key = this.array.get(i);
            int j = i - 1;

            while (j > 0 && this.array.get(j) > key) {
                this.array.add(j + 1, this.array.get(j));
                j = j - 1;
            }
            this.array.add(j + 1, key);
        }
    }

    public ArrayList<Integer> getArray() {
        return this.array;
    }
}
