package Week4Folder.Chapter11HW;

import java.util.Scanner;

/**
 * (Implement MyStack using inheritance) In Listing 11.10, MyStack is
 * implemented using composition. Define a new stack class that extends
 * ArrayList. Draw the UML diagram for the classes and then implement MyStack.
 * Write a test program that prompts the user to enter five strings and displays
 * them in reverse order.
 *
 *
 * @author Administrator Gabe
 */
public class HWpagec11n10 {

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 strings... ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println("Displaying them in reverse order.");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
