package Week2Folder.HWpage278;

import java.util.Scanner;

/**
 * page 278 7.12
 *
 * @author Administrator
 */
public class ReverseArray {

    public static void main(String[] args) {
        String one, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a array: ");
        one = in.nextLine();
        int length = one.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + one.charAt(i);
        }
        System.out.println("The reversed array is ---> " + reverse);
    }
}
