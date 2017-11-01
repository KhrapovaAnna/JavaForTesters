package anna.cources.sandbox;

public class Distance {

    public static void main (String[] args) {
        Point p1 = new Point (0, 0);
        Point p2 = new Point (10, 10);

        System.out.println("Distance between ("+ p1.x +", "+ p1.y + ")  and ("+ p2.x +", "+ p2.y + ") is " + p1.distance(p2));
    }
}


