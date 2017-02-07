package Week2Folder.HWpage200;

import java.util.Scanner;

/**
 * Assume letters A, E, I, O, and U as the vowels. Write a program that prompts
 * the user to enter a string and displays the number of vowels and consonants
 * in the string.
 *
 *
 * @author Administrator Gabe
 */
public class CountVowelsConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (a sentence of word): ");
        String str = sc.nextLine();

        String vowels = "aeiouAEIOU";
        int vowel = 0;
        int consonant = 0;
        int i = 0;
        int length = str.length();

        for (i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            if (vowels.indexOf(currentChar) >= 0) {
                vowel++;
            } else if (Character.isLetter(currentChar)) {
                consonant++;
            }
        }
        System.out.println("The number of vowels is: " + vowel);

        System.out.println("The number of consonants is: " + consonant);
    }
}
