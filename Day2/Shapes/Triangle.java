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
        int largeHypotenuse = (int) (hypotenuse * 10);
        for (int y = 0; y < largeHeight; y++) {
            for (int x = 0; x < largeBase; x++) {
                if (x == 0 || y == 0 || y / x == largeHypotenuse) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Triangle rect = new Triangle(5, 6);
        double area = rect.calculateArea();
        System.out.println(area);
        rect.display();
    }

}
