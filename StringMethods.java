import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        // part a
        System.out.print("Enter a word: ");
        word = input.next();
        System.out.println(word + " contains " + word.length() + " characters. ");
        // part b
        System.out.println(" First character of " + word + ": " + word.charAt(0) + " and the last character is " + 
                             word.charAt(word.length() - 1));
        //part c
        char second = word.charAt(1);
        System.out.println("Second character: " + word.charAt(1));
        int index = word.indexOf(second);
        System.out.println("In " + word + " second character is " + second);
        System.out.println("Is found at index: " + index);
        System.out.println("Second character: " + word.charAt(index));
        
        input.close();
        
    }
    
}
