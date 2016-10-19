package divideAndConquer;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-10-19.
 */
public class Fibonacci {
    private ArrayList<BigInteger> arrayList = new ArrayList<>();
    private BigInteger[][] square = new BigInteger[2][2];

    public Fibonacci() {
        this.arrayList.add(new BigInteger("0"));
        this.arrayList.add(new BigInteger("1"));
        this.square[0][0] = new BigInteger("1");
        this.square[0][1] = new BigInteger("1");
        this.square[1][0] = new BigInteger("1");
        this.square[1][1] = new BigInteger("0");
    }

    public BigInteger recursionFibonacci(int n) {
        if (n < 2) {
            return new BigInteger(String.valueOf(n));
        }
        else {
            return recursionFibonacci(n - 1).add(recursionFibonacci(n - 2));
        }
    }

    public BigInteger arrayFibonacci(int n) {
        if (n < 2 && n >= 0) {
            return this.arrayList.get(n);
        }
        else {
            this.arrayList.set(n, this.arrayList.get(n - 1).add(this.arrayList.get(n - 2)));
            return this.arrayList.get(n);
        }
    }

    public BigInteger recursiveSquaringFibonacci(int n) {
        if (n < 2) {
            return new BigInteger(String.valueOf(n));
        }
        return pow(square, n)[0][1];
    }

    private BigInteger[][] pow(BigInteger[][] array, int n) {
        if (n == 1) {
            return array;
        }
        else if (n % 2 == 0) {
            mul(pow(array, n/2), pow(array, n/2));
        }
        else {
            mul(mul(pow(array, (n - 1) / 2), pow(array, (n-1) / 2)),array);
        }
    }

    private BigInteger[][] mul(BigInteger[][] first, BigInteger[][] second) {
        BigInteger[][] result = new BigInteger[2][2];
        result[0][0] = ;
        result[0][1] = ;
        result[1][0] = ;
        result[1][1] = ;
    }
}
