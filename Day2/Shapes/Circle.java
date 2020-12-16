package Day2.Shapes;

public class Circle implements Shape {

    int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void display() {
        int gridSize = radius * 2;
        int center = radius;
        if (radius % 2 == 0) {
            // in order to have a center
            gridSize += 1;
            center += 1;
        }

        for (int y = 0; y < gridSize; y++) {
            for (int x = 0; x < gridSize; x++) {
                // System.out.println((int) Math.sqrt(Math.pow(x - center, 2) + Math.pow(y -
                // center, 2)));
                if (radius == (int) Math.sqrt(Math.pow(x - center, 2) + Math.pow(y - center, 2))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Circle circ = new Circle(15);
        System.out.println(circ.calculateArea());
        circ.display();
    }
}
