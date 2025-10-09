import java.util.Scanner;

public class Arrays {
    public static int search(int[] array, int target) {
        int foundIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    } 
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int[] numbers = new int[5];
        String answer;
        
        
            System.out.print("Enter 5 numbers: ");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }
            System.out.print("What number are you looking for? ");
            int value = input.nextInt();
            int location = search(numbers, value);
            if (location == -1) {
                System.out.println("Not found");
            }
            else {
                System.out.println("Found at location: " + location); 
            }
            System.out.println("Do you wat to keep searching? (Y/N)");
            answer = input.next();
        while (answer.equalsIgnoreCase("Y"));
        System.out.println("Goodbye! ");
        input.close();
    }
}

