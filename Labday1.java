
/**
 * Descrimption: This is a program that prints a hello message alomg with the time
 * @author Jonah Martin
 * @since 8/26/2025
 */
public class Labday1 {
    public static void main(String args[]) {
        System.out.println("Hello, Jonah") ;
    
        int hour = Integer.valueOf(args[0]);
        int minute = Integer.valueOf(args[1]); 
        int second = Integer.valueOf(args[2]);
        int numberOfSecs = second + minute * 60 + hour * 60 * 60;
        System.out.println("The Current time is " + hour + ":" + minute + ":" + second) ; 
    
    
    }

}