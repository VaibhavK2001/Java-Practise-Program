/**
 * Rev_word_in_String
 */
public class ReverseWordInString {
        public static void main(String[] args) {
            
         String str = "Heyy Good Morning";
         String words[] = str.split(" ");
         String  revString = "";
    
         for (String string : words) {
               String rev = "";
               for (int i = string.length()-1; i >= 0; i--) {
                rev = rev + string.charAt(i);
               }
               revString = revString + rev+" ";
            }
         
            System.out.println(revString);
        }
}
    
