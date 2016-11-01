package divideAndConquer;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-11-02.
 */
public class Inversion {
    private ArrayList<Integer> arrayList;
    private int count;

    public Inversion(int count, ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
        this.count = count;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public int getCount() {
        return count;
    }
}
