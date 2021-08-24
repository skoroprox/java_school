package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point p = new Point(1, 8);
        Assert.assertEquals(p.distance(), 8.06225774829855);
    }

}
