package Day2.Shapes;

public class Circle implements Shape {

    double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void display() {

    }

}
