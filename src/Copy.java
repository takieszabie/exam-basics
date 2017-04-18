public class Copy {

  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    ArgumentContainer inputArgs = new ArgumentContainer(args);

    handleArgs(inputArgs);
  }

  private static void handleArgs(ArgumentContainer inputArgs) {
    switch (inputArgs.getNumOfElements()) {
      case 0:
        printUsage();
        break;
      case 1:
        System.out.println("No destination provided");
        break;
      case 2:
        copyFile(inputArgs);
        break;
      default:
        printUsage();
        break;
    }
  }

  private static void printUsage() {
    System.out.println("Usage: Copy [source] [destination]");
  }

  private static void copyFile(ArgumentContainer inputArgs) {
    System.out.println("Want to copy '" + inputArgs.getArg(0)
            + "' to '" + inputArgs.getArg(1));
  }

}