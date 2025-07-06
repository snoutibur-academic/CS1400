/* Last modified: 2023-04-25 */

package Sem2.ListsNSorts;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ALnumCounter {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Random r = new Random();
            int counter = 0;
            ArrayList<Integer> stoffls = new ArrayList<>();

            for(int x = 0; x < 100; x+=1) {
                stoffls.add(r.nextInt(100));
            }
            
            System.out.println(stoffls);

            System.out.println("CHOOSE A NUMBA YA DINGUS!");
            int lookForMe = in.nextInt();

            for(int y = 0; y < (stoffls.size()) -1 ; y+=1) {
                if(lookForMe == stoffls.get(y)) {
                    counter+=1;
                }
            }
            
            System.out.println("Yer number appears:");
            System.out.println(counter + " times.");
        }
    }
}
