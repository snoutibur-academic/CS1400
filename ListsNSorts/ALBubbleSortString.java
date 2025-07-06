/* Last modified: 2023-04-25 */

package Sem2.ListsNSorts;

import java.util.ArrayList;

public class ALBubbleSortString {

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

        ArrayList<String> RickAstley = new ArrayList<>();
        RickAstley.add("give");
        RickAstley.add("you");
        RickAstley.add("up");

        BubbleSort(RickAstley);
        System.out.println(RickAstley);
    }
}