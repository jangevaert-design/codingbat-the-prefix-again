package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatThePrefixAgainTest {

  private String[] stringParams = {
      "abXYabc",
      "abXYabc",
      "abXYabc",
      "xyzxyxyxy",
      "xyzxyxyxy",
      "Hi12345Hi6789Hi10",
      "Hi12345Hi6789Hi10",
      "Hi12345Hi6789Hi10",
      "Hi12345Hi6789Hi10",
      "a",
      "aa",
      "ab"
  };

  private int[] intParams = {1, 2, 3, 2, 3, 1, 2, 3, 4, 1, 1, 1};

  private boolean[] booleanExpected = {true, true, false, true, false, true, true, true, false,
      false, true, false};

  @Test
  void testPrefix() {
    for (int i = 0; i < stringParams.length; i++) {
      boolean actual = CodingBatThePrefixAgain.prefixAgain(stringParams[i], intParams[i]);
      Assertions.assertEquals(actual, booleanExpected[i]);
    }
  }

}