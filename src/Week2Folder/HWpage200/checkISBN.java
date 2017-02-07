package Week2Folder.HWpage200;

import java.util.Scanner;

/**
 * ISBN-13 is a new standard for identifying books. It uses 13 digit
 * d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is checksum, which is
 * calculated from the older digits using the following formula: 10 -
 * (d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12+d13) %10 if checksum is 10, replace
 * it with 0. Your program should read the input as a string.
 *
 * UNFINISHED
 *
 * @author Administrator Gabe
 */
public class checkISBN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first 12 digits of an ISBN-13 string: ");
        String s = sc.nextLine();

        if (s.length() == 12) {
            int sum = 0;
            int checksum = 0;
            for (int i = 1; i <= 12; i++) {
                if (i % 2 == 0) {
                    sum += 3 * Integer.parseInt(s.substring(i - 1, i));
                } else {
                    sum += Integer.parseInt(s.substring(i - 1, i));
                }
            }
            checksum = 10 - sum % 10;
            if (checksum == 10) {
                checksum = 0;
            }
            System.out.println("The ISBN number is " + s + checksum);
        } else {
            System.out.println(s + " is invalid input");
        }
    }
}
