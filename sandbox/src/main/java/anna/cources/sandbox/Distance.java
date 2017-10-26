package anna.cources.sandbox;

public class Distance {

    public static void main (String[] args) {
        Point p1 = new Point (5, 5);
        Point p2 = new Point(10, 10);

        System.out.println("Distance between two points is " + distance(p1, p2));
    }



    public static double distance (Point p1, Point p2) {

        double l;
        return l = Math.sqrt ((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));

    }
}


