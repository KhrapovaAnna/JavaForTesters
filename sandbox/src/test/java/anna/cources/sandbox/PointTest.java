package anna.cources.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void test1Length(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point (10, 10);
        Assert.assertEquals(p1.distance(p2), 14.0);
    }
    @Test
    public void test2Length() {
        Point p1 = new Point (0,0);
        Point p2 = new Point (1, 1);
        Assert.assertEquals(p1.distance(p2), 1.0);
    }
    @Test
    public void test3Length(){
        Point p1 = new Point (5,-5);
        Point p2 = new Point (33, 16);
        Assert.assertEquals(p1.distance(p2), 35.00);
    }
    @Test
    public void test4Length(){
        Point p1 = new Point (0,-0);
        Point p2 = new Point (0, 0);
        Assert.assertEquals(p1.distance(p2), 0.0);
    }
}
