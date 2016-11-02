package divideAndConquer;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by SeongJung on 2016-11-02.
 */
public class ClosestPair {
    public double closestPair(ArrayList<Point> arrayList) {
        arrayList.sort(Comparator.comparing(Point::getX));

        if (arrayList.size() <= 3) {
            double min = euclidianDistance(arrayList.get(0), arrayList.get(1));
            for (int i = 0; i < arrayList.size(); i++) {
                for (int j = i + 1; j < arrayList.size(); j++) {
                    double temp = euclidianDistance(arrayList.get(i), arrayList.get(j));
                    if (min > temp) {
                        min = temp;
                    }
                }
            }
            return min;
        }

        double first = closestPair(new ArrayList<>(arrayList.subList(0, arrayList.size()/2)));
        double second = closestPair(new ArrayList<>(arrayList.subList(arrayList.size()/2, arrayList.size())));
        double min = (first < second) ? first : second;

        ArrayList<Point> reduce = new ArrayList<>(arrayList.subList((int)(arrayList.size()/2-min), (int)(arrayList.size()/2+min)));
        reduce.sort(Comparator.comparing(Point::getY));

        double result = 0;
        for (int i = 0; i < reduce.size(); i++) {
            for (int j = i + 1; j < reduce.size(); j++) {
                if (reduce.get(j).getY() - reduce.get(i).getY() < min) {
                    result = euclidianDistance(reduce.get(i), reduce.get(j));
                }
            }
        }

        return result;
    }

    private double euclidianDistance(Point p, Point q) {
        return Math.sqrt(Math.pow((q.getX() - p.getX()),2) + Math.pow((q.getY() - p.getY()),2));
    }
}
