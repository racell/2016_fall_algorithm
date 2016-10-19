package divideAndConquer;

import java.util.Scanner;

/**
 * Created by SeongJung on 2016-10-19.
 */
public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. recursion fibonacci");
        System.out.println("2. array fibonacci");
        System.out.println("3. recursive squaring fibonacci");
        System.out.print("원하는 방식의 번호를 입력하세요 : ");
        int type = scanner.nextInt();
        System.out.print("피봐치 수횅횟수를 입력하세요 : ");
        int num = scanner.nextInt();

        long start, end;

        switch (type) {
            case 1:
                for (int i = 0; i <= num; i++) {
                    start = System.nanoTime();
                    System.out.print("f<" + i + "> = " + fibonacci.recursionFibonacci(i));
                    end = System.nanoTime();
                    System.out.println("  실행시간 : " + (end - start) + "sec");
                }
                break;
            case 2:
                for (int i = 0; i <= num; i++) {
                    start = System.nanoTime();
                    System.out.print("f<" + i + "> = " + fibonacci.arrayFibonacci(i));
                    end = System.nanoTime();
                    System.out.println("  실행시간 : " + (end - start) + "sec");
                }
                break;
            case 3:
                for (int i = 0; i <= num; i++) {
                    start = System.nanoTime();
                    System.out.print("f<" + i + "> = " + fibonacci.recursiveSquaringFibonacci(i));
                    end = System.nanoTime();
                    System.out.println("  실행시간 : " + (end - start) + "sec");
                }
                break;
            default :
                System.out.println("잘못된 입력입니다.");
        }
    }
}
