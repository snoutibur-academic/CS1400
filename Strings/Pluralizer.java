/* Last modified: 2023-04-25 */

package Sem2.Strings;

import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("gib word, get plural");
            String stIn = in.nextLine();

            if (stIn.endsWith("fe")) {
                System.out.println(stIn.replace("fe", "ves"));
            } 
            else if(stIn.endsWith("us")) {
                System.out.println(stIn.replace("us", "i"));
            }   
            else if (stIn.endsWith("sh")) {
                System.out.println(stIn.replace("sh", "es"));
            } 
            else if (stIn.endsWith("ch")){
                System.out.println(stIn.replace("ch", "es"));
            }
            else if (stIn.endsWith("ay")) {
                System.out.println(stIn.replace("ay", "s"));
            }
            else if (stIn.endsWith("oy")) {
                System.out.println(stIn.replace("oy", "s"));
            }
            else if (stIn.endsWith("ey")) {
                System.out.println(stIn.replace("ey", "s"));
            }
            else if (stIn.endsWith("uy")) {
                System.out.println(stIn.replace("uy", "s"));
            }
            else if (stIn.endsWith("y")) {
                System.out.println(stIn.replace("y", "ies"));
            }
            else {
                System.out.println(stIn + "s");
            }
        }
    }
}