package oddavg;

public class ArgumentHandler {
  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }
  public boolean noArgs() {
    return args.length == 0;
  }
  public boolean isList() {
    return args[0].equals("-l");
  }
  public boolean isAdd() {
    return args[0].equals("-a");
  }
  public boolean isRemove() {
    return args[0].equals("-r");
  }
  public boolean isComplete() {
    return args[0].equals("-c");
  }
}