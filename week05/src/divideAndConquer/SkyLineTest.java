package divideAndConquer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-10-19.
 */
public class SkyLineTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SkyLine skyLine = new SkyLine();
        ArrayList<Building> buildings = new ArrayList<>();

        System.out.print("빌딩의 수를 입력하세요 : ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("건물의 좌표와 높이 입력 (왼쪽, 높이, 오른쪽) : ");
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), ", ");
            while (stringTokenizer.hasMoreTokens()) {
                buildings.add(new Building(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())));
            }
        }
        skyLine.printSkyLine(buildings, num-1);
    }
}
