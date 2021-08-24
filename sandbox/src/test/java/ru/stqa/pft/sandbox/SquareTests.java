package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25 );
    }

    @Test
    public void testDistance() {
        Point p = new Point(1, 8);
        Assert.assertEquals(p.distance(), 8.06225774829855);
    }
}
