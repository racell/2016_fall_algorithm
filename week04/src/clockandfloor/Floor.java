package clockandfloor;

/**
 * Created by SeongJung on 2016-10-12.
 */
public class Floor {
    private int count;
    private int binaryCount;

    public int calcFloor(int n) {
        int exp = -1;
        int floorValue = 1;

        while (floorValue <= n) {
            exp++;
            floorValue = floorValue * 2;
            this.count++;
        }

        return exp;
    }

    public int getCount() {
        return this.count;
    }

    public int calcBinaryFloor(double n) {
        int exp = 1;
        int floorValue = 1;

        while (Math.pow(2, exp) <= n) {
            floorValue = exp;
            exp = exp * 2;
            this.binaryCount++;
            if (Math.pow(2, floorValue) == n) {
                return floorValue;
            }
        }

        while (!(exp - floorValue == 1)) {
            int mid = (exp - floorValue) / 2 + floorValue;
            if(Math.pow(2, mid) < n) {
                floorValue = mid;
            }
            else {
                exp = mid;
            }
            this.binaryCount++;
        }

        return floorValue;
    }

    public int getBinaryCount() {
        return this.binaryCount;
    }
}
