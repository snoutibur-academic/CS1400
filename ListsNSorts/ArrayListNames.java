/* Last modified: 2023-04-25 */

package Sem2.ListsNSorts;

import java.util.ArrayList;

public class ArrayListNames {

    public static void BubbleSort(ArrayList<String> stIn) {
        for (int x = 0; x < (stIn.size()) - 1; x++) {
            for (int i = 0; i < (stIn.size()) - 1; i++) {
                if (stIn.get(i).compareTo(stIn.get(i + 1)) > 0) {
                    String temp = stIn.get(i);
                    stIn.set(i, stIn.get(i+1));
                    stIn.set(i + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Initial array
        String[] meaninLessName = new String[] {"zack", "brendon", "james", "bjorn",  "jacob", "john", "revan"};

        ArrayList<String> meaninfulName = new ArrayList<>();
        for(String EA : meaninLessName) {
            meaninfulName.add(EA);
        }
        
        meaninfulName.add("dory");
        meaninfulName.add("jimmy");
        meaninfulName.add("katy");

        BubbleSort(meaninfulName);
        System.out.println(meaninfulName);
    }
}
