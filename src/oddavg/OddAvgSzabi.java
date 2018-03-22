package oddavg;

import java.util.ArrayList;
import java.util.List;

public class OddAvgSzabi {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }
  public double oddAverage(List<Integer> list1) {
    List<Integer> listOfOdds = new ArrayList<>();
    for (int i = 0; i < list1.size(); i++) {
      if (list1.get(i)%2!=0) {
        listOfOdds.add(list1.get(i));
      }
    }
    double sumOfOdds = 0;
    for (int i = 0; i < listOfOdds.size(); i++) {
      sumOfOdds = sumOfOdds + listOfOdds.get(i);
    }
    return sumOfOdds/listOfOdds.size();
  }
}
