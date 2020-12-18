package Day4.Line;

public class Line {
    public Line(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getSlope() {
        if (x1 == x0) {
            throw new ArithmeticException();
        }
        return (y1 - y0) / (x1 - x0);
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
    }

    public boolean parallelTo(Line l) {
        if (Math.abs(this.getSlope() - l.getSlope()) < .0001) {
            return true;
        } else {
            return false;
        }
    }

    private double x0, x1, y0, y1;
}
