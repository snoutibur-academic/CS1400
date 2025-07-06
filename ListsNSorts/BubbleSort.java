/* Last modified: 2023-04-25 */

package Sem2.ListsNSorts;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static int[] BblSrt(int[] num) {
        for(int x = 0; x < (num.length)-1; x++) {
            for(int i = 0; i < (num.length)-1; i++) {
                if(num[i] > num[i+1]) {
                   int temp = num[i];
                   num[i] = num[i+1];
                   num[i+1] = temp;
                }          
            }
         }
        return num;
    }

    public static void main(String[] args) {
        Random r = new Random();

        int OwO[] = new int[100];

        for(int i = 0; i < 100; i++) {
            OwO[i] = r.nextInt(1000);
        }

        BblSrt(OwO);

        
        System.out.println(Arrays.toString(OwO));
    }
}


// This is busted.
// int[] OwO = new int[] {6, 9, 2, 1, 5, 6, 7, 4};
// System.out.println(Arrays.toString(OwO));
//  // sort it
//  for(int x = 0; x < (OwO.length)-1; x++) {
//     for(int i = 0; i < (OwO.length)-1; i++) {
//         if(OwO[i] > OwO[i+1]) {
//            int temp = OwO[i];
//            OwO[i] = OwO[i+1];
//            OwO[i+1] = temp;
//         }          
//     }
//  }