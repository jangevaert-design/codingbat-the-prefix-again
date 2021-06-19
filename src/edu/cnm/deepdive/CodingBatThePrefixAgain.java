package edu.cnm.deepdive;

/*

Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */

public class CodingBatThePrefixAgain {

  public static void main(String[] args) {
    System.out.printf("with String %s and int %d, the outcome is " + prefixAgain("abXYabc", 1)
        + ".\n", "abXYabc", 1);
    System.out.printf("with String %s and int %d, the outcome is " + prefixAgain("abXYabc", 2)
        + ".\n", "abXYabc", 2);
    System.out.printf("with String %s and int %d, the outcome is " + prefixAgain("abXYabc", 3)
        + ".\n", "abXYabc", 3);
  }

  public static boolean prefixAgain(String str, int n) {

    return (str.lastIndexOf(str.substring(0, n)) != 0);

  }

}
