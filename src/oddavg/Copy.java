// This should be the basic replica of the 'cp' command
// If ran from the command line without arguments
// It should print out the usage:
// copy [source] [destination]
// When just one argument is provided print out
// No destination provided
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination

package oddavg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Copy {
  public static void main(String[] args) {
    ArgumentHandler newArgHandler = new ArgumentHandler(args);

    if (newArgHandler.noArgs()) {
      System.out.println("No destination provided");
    } else if (newArgHandler.isComplete()) {
      System.out.println("ez lesz a pipalas");
    }
  }

  private static void copy(String sourceFileName, String targetFileName) {
    List<String> sourceContent;
    try {
      Path sourcePath = Paths.get(sourceFileName);
      sourceContent = Files.readAllLines(sourcePath);
      Path targetPath = Paths.get(targetFileName);
      Files.write(targetPath, sourceContent);
    } catch (IOException e1) {
      e1.printStackTrace();
    }
  }
}
