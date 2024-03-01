/*
 * Activity 3.7.5
 */
public class SimpleSearchRedo {
  public static void main(String[] args) {
    int[] primeUnder50 = { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
    int numToSearchFor = UserInput.getInt();

    /* your code goes here */
    int index = 0;
    for (int i : primeUnder50) {
      if (i == numToSearchFor) {
        System.out.print(numToSearchFor + " was found at index " + index);
      }
      index++;
    }

    int num = 0;
    while (num < primeUnder50.length) {
      if (primeUnder50[num] == numToSearchFor) {
        System.out.print(numToSearchFor + " was found at index " + num);
      }
      num++;
    }
  }
}