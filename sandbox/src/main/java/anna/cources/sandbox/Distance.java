package anna.cources.sandbox;

public class Distance {

    public static void main (String[] args) {
        Point p = new Point (0, 5, 10.5, 10);

        System.out.println("Distance between ("+ p.x1 +", "+ p.y1 + ")  and ("+ p.x2 +", "+ p.y2 + ") is " + p.distance());
    }
}


