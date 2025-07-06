/* Last modified: 2023-04-25 */

package Sem2.ListsNSorts;

import java.util.ArrayList;
import java.util.Random;

public class ALBubbleSort {
    // Make a list of numbers similar to the first bubble sort assignment and then
    // sort.

    public static void BubbleSort(ArrayList<Integer> nums) {
        for (int x = 0; x < (nums.size()) - 1; x++) {
            for (int i = 0; i < (nums.size()) - 1; i++) {
                if (nums.get(i) > nums.get(i + 1)) {
                    int temp = nums.get(i);
                    nums.set(i, i+1);
                    nums.set(i + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> stoffls = new ArrayList<>();
        for (int x = 0; x < 100; x++) {
            stoffls.add(r.nextInt(256));
        }
        BubbleSort(stoffls);
        System.out.println(stoffls);
    }
}