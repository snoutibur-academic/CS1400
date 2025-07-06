/* Last modified: 2023-04-25 */

package Sem2.ListsNSorts;

import java.util.Arrays;

public class BubbleSortStrings {

    public static String[] BubbleSort(String [] methodIn) {
        for(int x = 0; x < (methodIn.length)-1; x++) {
            for(int i = 0; i < (methodIn.length)-1; i++) {
                if((methodIn[i].compareTo(methodIn[i+1]) > 0)) {
                   String temp = methodIn[i];
                   methodIn[i] = methodIn[i+1];
                   methodIn[i+1] = temp;
                }
            }
         }
        return methodIn;
    }

    public static void main(String[] args) {
        String[] rick = new String[] {"dog", "cat", "space", "computer", "eightbit", "keyboard", "electronicarts", "scrolls", "robloz", "degenerate", "deprivaty", "never", "gonna", "give", "you", "up", "let", "you", "down"};
        
        BubbleSort(rick);

        System.out.println(Arrays.toString(rick));

    }
}