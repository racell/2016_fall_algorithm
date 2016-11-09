package Dijkstra;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-11-09.
 */
public class DijkstraTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes : ");
        int nodes = Integer.parseInt(scanner.nextLine());

        System.out.println();

        int[][] cost = new int[nodes][nodes];
        System.out.println("Enter the cost matrix : ");
        for (int i = 0; i < nodes; i++) {
            String line = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
            for (int j = 0; stringTokenizer.hasMoreTokens(); j++) {
                cost[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        System.out.println();

        System.out.print("Enter the source matrix : ");
        int source = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.println();

        Dijkstra dijkstra = new Dijkstra(nodes);
        int[] result = dijkstra.shortestPath(cost, source);

        System.out.println("Shortest path :");
        for (int i = 0; i < result.length; i++) {
            if (i != source) {
                System.out.println(source + "->" + i + ", cost = " + result[i]);
            }
        }
    }
}
