
public class Palindrome {

    // Method for find next smallest palindrome lager that entered number
    public int findNextPalindrome(int number){

        // numbers from 1 to 9 all are palindrome numbers
        if(number < 9) {
            return number + 1;
        } else {
            while(true) {
                number += 1;
                if(isPalindrome(number))
                    break;
            }
            return number;
        }
    }

    // Method for checking a number
    public boolean isPalindrome(int i) {

        String s = String.valueOf(i);
        // easy way to see if a number is palindrome or not ;)
        return new StringBuilder(s).reverse().toString().equals(s);

    }

}
