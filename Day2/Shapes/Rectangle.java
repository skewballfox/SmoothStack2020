package Day2.Shapes;

public class Rectangle implements Shape {
    int width;
    int length;

    public Rectangle(int l, int w) {
        length = (int) l;
        width = (int) w;

    }

    @Override
    public double calculateArea() {

        return width * length;
    }

    @Override
    public void display() {

        for (int y = 0; y < length; y++) {
            for (int x = 0; x < width; x++) {
                if (x == 0 || x == width - 1 || y == 0 || y == length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 6);
        double area = rect.calculateArea();
        System.out.println(area);
        rect.display();
    }

}
