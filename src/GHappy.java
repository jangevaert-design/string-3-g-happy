public class GHappy {
/*

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately
to its left or right.
Return true if all the g's in the given string are happy.
 */

  public static void main(String[] args) {
    String str = "xxggyyggxxg";

    System.out.printf("\nthe string %s gives: " + gHappy(str)+ "\n", str);
  }

  public static boolean gHappy(String str) {
    boolean result = true;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'g') {
        if (i > 0 && str.charAt(i - 1) == 'g') {
          result = true;
        }
        else if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
          result = true;
        } else {
          result = false;
        }
      }
    }
    return result;
  }
}
