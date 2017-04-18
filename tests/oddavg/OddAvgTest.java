package oddavg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class OddAvgTest {

  List<Integer> testInput;

  @Test
  void oddAverage_3numbers() {
    testInput = Arrays.asList(5, 10, 15);
    assertEquals(10d, OddAvg.oddAverage(testInput));
  }
}