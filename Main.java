import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Palindrome Palindrome =  new Palindrome();
        int nextPalindrome = Palindrome.findNextPalindrome(readNumber()); // found next palindrome and print result to console
        System.out.println("Next palindrome: " + nextPalindrome);
    }

    // Method for read a number from keyboard
    public static int readNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entering the natural number by integer type: ");
        while (true){
            try {
                if(scanner.hasNextInt()){
                    number = scanner.nextInt();
                    if (number <= 0){
                        throw new NumberFormatException("Error: your entered incorrect number " + number + " number must be positive.");
                    }
                    break;
                } else throw new NumberFormatException("Error: your entered incorrect number.");
            } catch (NumberFormatException e){
                System.out.print(e + " Please, enter the data again ");
            }
        }
        return number;
    }

}
