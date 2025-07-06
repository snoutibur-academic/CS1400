/* Last modified: 2023-04-25 */

package Sem2.Strings;

import java.util.Scanner;

public class FirstTjreeLetters {
    
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Word ya dingus:");
            String thing = in.nextLine();
            
            System.out.println("Le first 3 characters of yer string is:");
            for(int x = 0; x<3; x++) {
                System.out.print(thing.charAt(x) + ", ");
            }
        }

    }
}
