public class Antics {

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1; 

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
   
    public static boolean isAbecedarian(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false; 
            }
        }
        
        return true;
    }
}