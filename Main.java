import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Test the sumArray method with an array of doubles
    double[] doubleArray = {1.2, 3.4, 5.6, 7.8};
    System.out.println("Sum of array: " + sumArray(doubleArray));

    // Test the averageLength method with an array of Strings
    String[] stringArray = {"hello", "world", "java", "programming"};
    System.out.println("Average length of strings: " + averageLength(stringArray));

    // Test the arrayMax method with an array of ints
    int[] intArray = {3, 5, 7, 2, 9, 4};
    System.out.println("Maximum value in array: " + arrayMax(intArray));

    // Test the linearSearch method with an array of Strings and a target String
    String[] searchArray = {"apple", "banana", "cherry", "date"};
    String target = "banana";
    System.out.println("Is target found? " + linearSearch(searchArray, target));
  }


  // Method to return the sum of an array of doubles
  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for (double num : arr) {
      sum += num;
    }
    return sum;
  }

  // Method to return the average length of strings in an array
  public static double averageLength(String[] arr)
  {
    if (arr.length == 0) {
      return 0.0;
    }

    int totalLength = 0;
    for (String str : arr) {
      totalLength += str.length();
    }
    return (double) totalLength / arr.length;
  }

  // Method to return the maximum value in an array of integers
  public static int arrayMax(int[] arr)
  {
    int max = Integer.MIN_VALUE;
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  // Method to return true if the target string is found in the array, otherwise false
  public static boolean linearSearch(String[] arr, String target)
  {
    for (String str : arr) {
      if (str.equals(target)) {
        return true;
      }
    }
    return false;
  }
}
