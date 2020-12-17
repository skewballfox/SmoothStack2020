package Day3;

import java.io.FileInputStream;
import java.io.IOException;

public class charCount {
    public static void main(String[] args) {

        String file = "";
        int charToCount = 0;
        int count = 0;

        try {
            file = args[0];
            charToCount = (int) args[1].charAt(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you forgot to supply an argument");
            System.exit(0);
        }
        try (FileInputStream in = new FileInputStream(file)) {
            int c;
            while ((c = in.read()) != -1) {
                if (c == charToCount) {
                    count++;
                }
            }
            System.out.println("the count of char " + (char) charToCount + " was " + count);
        } catch (IOException e) {
            System.out.println("there was an error opening the file");
            e.printStackTrace();
        }
    }
}
