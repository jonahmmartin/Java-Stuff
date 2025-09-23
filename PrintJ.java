public class PrintJ {
    
    public static void main(String[] args) {

        printJ(args[0]);
        printM(args[1]);
    }
    /** This method prints a letter of the alphabet using the character
        passed as a parameter
        @param J the character used to print the letter
    */
    static void printJ(String letter) {
        System.out.println(letter + letter + letter + letter + letter + letter);
        System.out.println("   " + letter + "   ");
        System.out.println("   " + letter + "   ");
        System.out.println("  " + letter + "   ");
        System.out.println(letter + letter + "   ");
       
   } public static void main(String[] args[]) {

    }
    /** This second set of code will print the first initail of my last name
     * @param M the character used to print the letter
     */
    static void printM(String letter) {
        System.out.println(letter + letter + "     " + letter + letter);
        System.out.println(letter +"  "+ letter + " " + letter + "  " + letter);
        System.out.println(letter + "   " + letter + "   " + letter);
        System.out.println(letter + "       " + letter);
        System.out.println(letter + "       " + letter);


       }   }