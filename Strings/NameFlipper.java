/* Last modified: 2023-04-25 */

package Sem2.Strings;

import java.util.Scanner;

public class NameFlipper {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Wat ya dingus name??");
            String thing = in.nextLine();

            int spaceAt = thing.indexOf(" ");

            String first = thing.substring(0, spaceAt);
            String last = thing.substring(spaceAt);

            System.out.print(last + ", " + first);
        }
    }
}