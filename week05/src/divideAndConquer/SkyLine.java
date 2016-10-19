package divideAndConquer;

import java.util.ArrayList;

/**
 * Created by SeongJung on 2016-10-19.
 */
public class SkyLine {
    public ArrayList<Node> findSkyLine(ArrayList<Building> buildings, int start, int end) {
        ArrayList<Node> skyLine = new ArrayList<>();
        if (start == end) {
            skyLine.add(new Node(buildings.get(start).getLeft(), buildings.get(start).getHeight()));
            skyLine.add(new Node(buildings.get(end).getRight(), 0));
            return skyLine;
        }
        int mid = (start + end) / 2;
        ArrayList<Node> sky1 = findSkyLine(buildings, start, mid);
        ArrayList<Node> sky2 = findSkyLine(buildings, mid + 1, end);
        return mergeSkyLine(sky1, sky2);
    }

    private ArrayList<Node> mergeSkyLine(ArrayList<Node> sky1, ArrayList<Node> sky2) {
        ArrayList<Node> result = new ArrayList<>();
        int currentH1 = 0;
        int currentH2 = 0;
        int currentX = 0;
        int maxH = 0;

        while (sky1.size() > 0 && sky2.size() > 0) {
            if (sky1.get(0).getLocation() < sky2.get(0).getLocation()) {
                currentX = sky1.get(0).getLocation();
                currentH1 = sky1.get(0).getHeight();
                maxH = currentH1;
                if (currentH2 > maxH) {
                    maxH = currentH2;
                }
                result.add(new Node(currentX, maxH));
                sky1.remove(0);
            }
            else {
                currentX = sky2.get(0).getLocation();
                currentH2 = sky2.get(0).getHeight();
                maxH = currentH1;
                if (currentH2 > maxH) {
                    maxH = currentH2;
                }
                result.add(new Node(currentX, maxH));
                sky2.remove(0);
            }
        }

        while (sky1.size() > 0) {
            result.add(sky1.remove(0));
        }

        while (sky2.size() > 0) {
            result.add(sky2.remove(0));
        }

        return result;
    }

    public void printSkyLine(ArrayList<Building> buildings, int num){
        ArrayList<Node> print = findSkyLine(buildings, 0,  num);
        System.out.print(print.get(0).getLocation() + ", ");
        System.out.print(print.get(0).getHeight() + ", ");
        for (int i=1 ; i<print.size() ; i++) {
            if (print.get(i).getHeight() != print.get(i-1).getHeight()) {
                System.out.print(print.get(i).getLocation() + ", ");
                System.out.print(print.get(i).getHeight() + ", ");
            }
        }
    }
}
