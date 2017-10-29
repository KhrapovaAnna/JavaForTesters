package anna.cources.sandbox;

public class Distance {

    public static void main (String[] args) {
        Point p1 = new Point (5, 5);
        Point p2 = new Point(10, 10);

        System.out.println("Distance between ("+ p1.x +", "+ p1.y + ")  and ("+ p2.x +", "+ p2.y + ") is " + distance(p1, p2));
    }

    public static double distance (Point p1, Point p2) {

        return Math.sqrt (Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2));

    }
}


