/* Last modified: 2023-04-25 */

package Sem2.Strings;

import java.util.Scanner;

public class StringMethodMethods {
    public static String getFirstThree(String word) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Word ya dingus:");
            // String thing = in.nextLine();
        }

        System.out.println("Le first 3 characters of yer string is:");
        String three = word.substring(0,3);
        return three;
    }

    public static String pluralizer(String stIn) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("gib word, get plural");
            stIn = in.nextLine();
        }

        if (stIn.endsWith("fe")) {
            return(stIn.replace("fe", "ves"));
        } 
        else if(stIn.endsWith("us")) {
            return(stIn.replace("us", "i"));
        }   
        else if (stIn.endsWith("sh")) {
            return(stIn.replace("sh", "es"));
        } 
        else if (stIn.endsWith("ch")){
            return(stIn.replace("ch", "es"));
        }
        else if (stIn.endsWith("ay")) {
            return(stIn.replace("ay", "s"));
        }
        else if (stIn.endsWith("oy")) {
            return(stIn.replace("oy", "s"));
        }
        else if (stIn.endsWith("ey")) {
            return(stIn.replace("ey", "s"));
        }
        else if (stIn.endsWith("uy")) {
            return(stIn.replace("uy", "s"));
        }
        else if (stIn.endsWith("y")) {
            return(stIn.replace("y", "ies"));
        }
        else {
            return(stIn + "s");
        }
    }

    public static String nameFlip(String name) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Wat ya dingus name??");
            String thing = in.nextLine();

            int spaceAt = thing.indexOf(" ");

            String first = thing.substring(0, spaceAt);
            String last = thing.substring(spaceAt);

            return(last + ", " + first);
        }
    }

    public static void main(String[] args) {
        
    }
}
