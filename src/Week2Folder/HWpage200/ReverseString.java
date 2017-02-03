package Week2Folder.HWpage200;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a string and displays the
 * string in reverse order.
 *
 * @author Administrator Gabe
 */
public class ReverseString {

    public static void main(String[] args) {
        String one, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        one = in.nextLine();

        int length = one.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + one.charAt(i);
        }

        System.out.println("The reversed string is ---> " + reverse);
    }
}
