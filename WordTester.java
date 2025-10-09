import java.util.Scanner;
/**
* Partner Lab 2 Tester Program
* @author Jonah Martin (main method)
*/

public class WordTester {

    /**
* Method to test the Antics methods
* @param args Command-line arguments (not used)
*/

public static void main(String[] args) {
    // Tests words or sentences @author Jonah Martin
    String text;
    Scanner input = new Scanner(System.in);
   //test palindrome
   System.out.println("Palindrome Tests");
   System.out.println("racecar:" + Antics.isPalindrome("racecar"));
   System.out.println("yes:" + Antics.isPalindrome("yes"));

   //test for Abecedarian @author Jonah Martin
   System.out.println("Abecedarian tests");
   System.out.println("biopsy:" + Antics.isAbecedarian("biopsy"));
   System.out.println("zebra:" + Antics.isAbecedarian("zebra"));
}

}