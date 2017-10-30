package anna.cources.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void test1Length(){
        Point p1 = new Point(0, 5, 10.5, 10);
        Assert.assertEquals(p1.distance(), 12.0);
    }
    @Test
    public void test2Length() {
        Point p1 = new Point (0,0,1,1);
        Assert.assertEquals(p1.distance(), 1.0);
    }
    @Test
    public void test3Length(){
        Point p1 = new Point (5,-5,33,16);
        Assert.assertEquals(p1.distance(), 35.5);
    }
    @Test
    public void test4Length(){
        Point p1 = new Point (0,-0,0,0);
        Assert.assertEquals(p1.distance(), 0.0);
    }
}
