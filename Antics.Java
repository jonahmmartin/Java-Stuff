public class Antics {
/* Lab 2 
 * @author Jonah Martin (isPalindrome and isAbecedarian)
 * @author Alvaro Atoche Gomez (isPangram and is capitilizeFirstLetter)
 * 
 */
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
    public static boolean isPangram(String text) {
        text = text.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!text.contains(String.valueOf(c))) return false;
        }
        return true;
    }

    public static String capitalizeFirstLetter(String text) {
        if (text == null || text.isEmpty()) return text;
        String[] words = text.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1).toLowerCase())
              .append(" ");
        }
        return sb.toString().trim();
    }

}