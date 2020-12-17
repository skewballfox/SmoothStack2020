package Day3;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

import java.nio.file.DirectoryStream;
import java.nio.file.Path;

public class ls {
    public static void main(String[] args) {
        // get a relative or absolute path from the commandline and return it's contents
        try (DirectoryStream<Path> dirPath = Files.newDirectoryStream(Paths.get(args[0]).toAbsolutePath())) {
            dirPath.forEach(path -> System.out.println(path));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you forgot to supply an argument");
        } catch (IOException e) {
            System.out.println("there was an IOException");
            e.printStackTrace();
        }
    }
}
