package clockandfloor;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by SeongJung on 2016-10-12.
 */
public class ClockAngleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClockAngle clockAngle = new ClockAngle();

        System.out.println("시간을 입력하세요");
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());
        int hour = Integer.parseInt(stringTokenizer.nextToken());
        int minute = Integer.parseInt(stringTokenizer.nextToken());

        if (hour > 12 || minute > 60) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println(clockAngle.calcAngle(hour, minute) + "도");
    }
}
