package Week2Folder;

import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;

/**
 * This is made using Github
 *
 * @author Administrator Gabe
 */
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rand = new Random();
        int answer = rand.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10");
        while (true) {
            System.out.println("Enter a number: ");
            if (sc.nextInt() == answer) {
                break;
            } else {
                System.out.println("Try again");
            }
        }
        System.out.println("YES! ^-^ you did it!");

    }

}
