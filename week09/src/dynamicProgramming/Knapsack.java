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
        this.bag = new int[itemSize][bagSize+1];
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

    public void insertTable() {
        for (int i = 0; i < itemSize; i++) {
            for (int j = 0; j <= bagSize; j++) {
                bag[i][j] = opt(i, j);
                System.out.printf("%4d", bag[i][j]);
            }
            System.out.println();
        }
    }

    public void printMaxValueAndPickedItems() {
        ArrayList<Integer> pickedItems = new ArrayList<>();
        System.out.println("Max : " + bag[itemSize-1][bagSize]);
        System.out.print("Items : ");
        int i = itemSize - 1;
        int j = bagSize;
        while (i > 0) {
            if (j < items.get(i).getWeight()) {
                i--;
                continue;
            } else if (bag[i][j] - bag[i - 1][j - items.get(i).getWeight()] == items.get(i).getValue()) {
                pickedItems.add(i);
                j = j - items.get(i).getWeight();
                i--;
                if (j == 0) {
                    break;
                }
            } else {
                i--;
            }
        }
        for (i = pickedItems.size() - 1; i >= 0; i--) {
            System.out.print(pickedItems.get(i) + " ");
        }
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
