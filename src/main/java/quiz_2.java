import java.util.Scanner;

/**
 *@author mc-pixel
 *@version 1.0(for the quiz)
  **/

public class quiz_2 {

    protected static boolean isPalindrome(String a){
        /**
         * only accepts 4 digit numbers
         **/
        String b = String.valueOf(a);
        int lng = a.length();
        /** gives the length of the String.
         * @param lng is the length of the string thats been given.
         **/


        if (a.charAt(0) == a.charAt(3) && a.charAt(1) == a.charAt(2)) {
            return true;
            /**
             * @return true if it is a palindrome
             **/
        } else {
            return false;
            /**
             * @return false if its not a palindrome
             **/

        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(isPalindrome(a));
        /**
         * @param a is the number given
         * @return if the number is palindrome or not
         **/

    }

  

}

