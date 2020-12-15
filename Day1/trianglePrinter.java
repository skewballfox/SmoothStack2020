package Day1;

public class trianglePrinter {

    public void printChars(String c, int number, int offset) {
        System.out.println(" ".repeat(offset) + c.repeat(number));
    }

    public void printRight(int base, boolean upwards) {

        if (upwards) {
            for (int i = 1; i <= base; i++) {
                printChars("*", i, 0);
            }

        } else {
            for (int i = base; i >= 0; i--) {
                printChars("*", i, 0);
            }
        }
    }

    public void printEquilateral(int base, boolean upwards) {
        if (upwards) {
            int offset = 2 + (base / 2);
            for (int i = 1; i <= base; i += 2) {
                printChars("*", i, offset);
                offset--;
            }

        } else {
            int offset = 2;
            for (int i = base; i >= 1; i -= 2) {
                printChars("*", i, offset);
                offset++;
            }
        }
    }

    public static void main(String[] args) {
        trianglePrinter printer = new trianglePrinter();

        int questionNumber = 1;
        int dotNumber = 9;
        boolean upwards = true;

        // overengineering done right
        while (questionNumber < 5) {
            System.out.println(questionNumber + ")");

            // dots proceed even questions
            if (questionNumber % 2 == 0) {
                printer.printChars(".", dotNumber, 0);
            }

            if (questionNumber < 3) {
                printer.printRight(4, upwards);
            } else {
                printer.printEquilateral(7, upwards);
            }

            // dots follow odd ones
            if (questionNumber % 2 == 1) {
                printer.printChars(".", dotNumber, 0);
            }
            System.out.println();
            dotNumber++;
            questionNumber++;

            // reverse direction
            upwards ^= true;
        }
    }
}