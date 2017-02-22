package Week4Folder.Chapter11HW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator Gabe - solution by Profphilips
 */
public class HWpage447c11n11 {
    public static void sort(ArrayList<Integer> list) {
        // one way is to use a lambda expression
        // list.sort((integer, anotherInteger) -> integer.compareTo(anotherInteger));
        //
        // I came across this simpler technique on stackoverflow at
        // http://stackoverflow.com/questions/23701943/sorting-arraylist-with-lambda-in-java-8
        list.sort(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list.add(Integer.parseInt(sc.nextLine()));
        }
        sort(list);
        System.out.println("Sorted list is " + list.toString());
}
}
