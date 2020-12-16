package Day2.Shapes;

import Day2.Shapes.Shape;

public class Triangle implements Shape {
    double base;
    double height;
    double hypotenuse;

    public Triangle(double b, double h) {
        base = b;
        height = h;
        hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println(hypotenuse);
    }

    @Override
    public double calculateArea() {

        return .5 * base * height;
    }

    @Override
    public void display() {
        int largeHeight = (int) (height * 10);
        int largeBase = (int) (base * 10);
        int slope = (largeHeight) / (largeBase);
        int b = 0;
        if (slope == 0) {
            slope = largeBase / largeHeight;
            b = (int) base;
        }
        System.out.println(slope);
        int d;
        for (int y = 0; y < largeHeight; y++) {
            try {
                d = largeBase - ((y - b) / slope);
            } catch (ArithmeticException e) {
                d = 1;
            }
            for (int x = 0; x < d; x++) {
                if (x == 0 || y == 0 || x == d - 1) {
                    System.out.print("*");// these are reversed,
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Triangle tri = new Triangle(7, 6);
        double area = tri.calculateArea();
        System.out.println(area);
        tri.display();
    }

}
