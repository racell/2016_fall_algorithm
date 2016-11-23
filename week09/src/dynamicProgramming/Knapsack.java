package dynamicProgramming;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-11-23.
 */
public class Knapsack {
    private int bagSize;
    private int itemSize;
    private int[][] bag;
    private ArrayList<Item> items;

    public Knapsack(int bagSize, int itemSize) {
        this.bagSize = bagSize;
        this.itemSize = itemSize;
        this.bag = new int[bagSize+1][itemSize+1];
    }

    public int opt(int index, int weight) {
        if (index == 0) {
            return 0;
        } else if (items.get(index).getWeight() > weight){
            return opt(index - 1, weight);
        } else {
            return Math.max(opt(index - 1, weight), items.get(index).getValue() + opt(index - 1, weight - items.get(index).getWeight()));
        }
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
