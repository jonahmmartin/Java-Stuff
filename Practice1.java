
/**
 * Homework 4
 * Descrimption: Prints a hello message and estimates age based on year given
 * @author Jonah Martin
 * @since 9/2/2025
 */
import java.util.*;
import java.util.Calendar;

public class Practice1 {
   //** Description */

  public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hello, What is your name?") ;
        name = input.nextLine();
        System.out.println("Nice to meet you " + name);
        System.out.println("What year where you born?");
        int year = input.nextInt();
        Calendar currentDate = Calendar.getInstance();
        int currentyear = currentDate.get(Calendar.YEAR);
        age = currentyear - year; 
        System.out.printf("It looks like you are approximately %d years old" , age);
        input.close();
    }

}
