package dynamicProgramming;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-11-23.
 */
public class KnapsackTest {
    public static void main(String[] args) throws IOException {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(0,0));
        Scanner scanner = new Scanner(new File("week09/src/dynamicProgramming/data11.txt"));
        while (scanner.hasNext()) {
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), ",");
            while (stringTokenizer.hasMoreTokens()) {
                stringTokenizer.nextToken();
                items.add(new Item(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())));
            }
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("베낭의 사이즈를 입력하세요 (0~50) : ");
        Knapsack knapsack = new Knapsack(scanner1.nextInt(), items.size());
        knapsack.setItems(items);
        knapsack.insertTable();
        knapsack.printMaxValueAndPickedItems();
    }
}
