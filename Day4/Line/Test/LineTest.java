package Day4.Line.Test;

import org.junit.Test;

import Day4.Line.Line;
import jdk.jfr.Timestamp;

import org.junit.Test;

public class LineTest {

    @Test
    public void getSlopeTest() {
        Line l1 = new Line(0, 0, 0, 1);

        Line l2 = new Line(0, 0, 1, 1);
        assertTrue(l1.getSlope() < .0001);

        assertTrue(Math.abs(l2.getSlope() - 1) < .0001);
    }

    @Test
    public void getSlopeTest() {
        Line l1 = new Line(0, 0, 0, 1);

        Line l2 = new Line(0, 0, 1, 1);
        assertTrue(l1.getSlope() < .0001);

        assertTrue(Math.abs(l2.getSlope() - 1) < .0001);
    }

    @Test
    public void getDistanceTest() {
        Line l1 = new Line(0, 0, 0, 1);

        Line l2 = new Line(0, 0, 1, 1);
        assertTrue(Math.abs(l1.getDistance() - 1) < .0001);

    }

    @Test
    public void parallelTest() {
        Line l1 = new Line(0, 0, 0, 1);
        Line l2 = new Line(0, 0, 0, 2);
        Line l3 = new Line(1, 2, 3, 4);
        assertEquals(l1.parallelTo(l2), true);
        assertEquals(l2.parallelTo(l3), false);
    }
}
