package Day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class appendText {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(args[0], true))) {
            writer.newLine();
            writer.write(String.join(" ", Arrays.copyOfRange(args, 1, args.length)));
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            System.out.println("there was an error opening the file");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you forgot to supply an argument");
            System.exit(0);
        }

    }
}
