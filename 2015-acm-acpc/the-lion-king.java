import java.io.*;
import java.util.*;

public class Solution {

    private static long MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            List<Point> points = new ArrayList<>(n);
            while(n-- > 0) {
                points.add(new Point(in.nextInt(), in.nextInt()));
            }
            long stars = countStars(points);
            System.out.println(stars);
        }
    }
    
    private static long countStars(List<Point> points) {
        List<Point> sortX = new ArrayList<>(points);
        List<Point> sortY = new ArrayList<>(points);
        Collections.sort(sortX, (Point a, Point b) -> Integer.compare(a.x, b.x));
        Collections.sort(sortY, (Point a, Point b) -> Integer.compare(a.y, b.y));
        List<List<Point>> yGroups = getYGroups(sortY);
        for (int i = 0; i < sortY.size(); ++i) {
            sortY.get(i).ypos = i;
        }
        for (int i = 0; i < sortX.size(); ++i) {
            sortX.get(i).xpos = i;
        }
        System.err.println("\ny " + sortY + "\nx " + sortX + "\ng " + yGroups);
        
        long count = 0L;
        for (List<Point> pg : yGroups) {
            Point first = pg.get(0);
            Point last = pg.get(pg.size() - 1);
            
            List<Point> bottom = sortY.subList(0, first.ypos);
            List<Point> top = sortY.subList(last.ypos + 1, sortY.size());
            
            count += countPart(top, pg, bottom);
            count %= MOD;
        }
        return count;
    }
    
    private static long countPart(List<Point> top, List<Point> mid, List<Point> bottom) {
        long count = 0L;
        if(top.size() < 1 || bottom.size() < 2) {
            System.err.println("\nBAD\nt " + top + "\nm " + mid + "\nb " + bottom);
            return count;
        }
        System.err.println("\nt " + top + "\nm " + mid + "\nb " + bottom);
        for (int i = 0; i < mid.size() - 1; ++i) {
            Point p2 = mid.get(i+1); // TODO mid choose 2 permutations
            Point p5 = mid.get(i);
            for (Point p1 : top) {
                boolean valid = p5.x < p1.x && p1.x < p2.x;
                if (!valid) {
                    continue;
                }
                Collections.sort(bottom, (Point a, Point b) -> Integer.compare(a.x, b.x));
                for (int j = 0; j < bottom.size() - 1; ++j) {
                    Point p3 = bottom.get(j+1);
                    Point p4 = bottom.get(j);
                    if (isStar(p1,p2,p3,p4,p5)) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }
    
    private static List<List<Point>> getYGroups(List<Point> points) {
        List<List<Point>> yGroups = new ArrayList<>();
        int prevY = points.get(0).y;
        for (int i = 1, start = -1; i < points.size(); ++i) {
            int currY = points.get(i).y;
            if (prevY == currY) {
                start = i - 1;
                continue;
            }
            if (prevY < currY && start > 0) {
                List<Point> subList = points.subList(start, i);
                Collections.sort(subList, (Point a, Point b) -> Integer.compare(a.x, b.x));
                yGroups.add(subList);
                start = -1;
            }
            prevY = currY;
        }
        return yGroups;
    }
    
    private static boolean isStar(Point p1, Point p2, Point p3, Point p4, Point p5) {
        boolean yConstraints =
            p5.y == p2.y &&
            p1.y > p5.y &&
            p3.y < p5.y && p4.y < p5.y;
        boolean xConstraints =
            p5.x < p1.x && p1.x < p2.x &&
            p5.x < p4.x && p4.x < p1.x &&
            p1.x < p3.x && p3.x < p2.x;
        return yConstraints && xConstraints;
    }
}

class Point {
    public int x, y, xpos, ypos;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() { return "(" + x + "," + y + ")"; }
}

