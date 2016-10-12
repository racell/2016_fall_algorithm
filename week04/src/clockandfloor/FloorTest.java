package clockandfloor;

import java.util.Scanner;

/**
 * Created by SeongJung on 2016-10-12.
 */
public class FloorTest {
    public static void main(String[] args) {
        Floor floor = new Floor();
        Scanner scanner = new Scanner(System.in);

        System.out.print("값을 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("floor value = " + floor.calcFloor(num1));
        System.out.println("수행 횟수 = " + floor.getCount());

        System.out.print("값을 입력하세요 : ");
        double num2 = scanner.nextDouble();
        System.out.println("floor value = " + floor.calcBinaryFloor(num2));
        System.out.println("수행 횟수 = " + floor.getBinaryCount());
    }
}
