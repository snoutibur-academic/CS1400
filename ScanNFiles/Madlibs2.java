/* Last modified: 2023-04-25 */

package Sem2.ScanNFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Madlibs2 {
    public static int getRandom() {
        Random r = new Random();
        return r.nextInt(100);
    }

    static ArrayList<String> noun = new ArrayList<>();
    static ArrayList<String> verb = new ArrayList<>();
    static ArrayList<String> adj = new ArrayList<>();

    public static String getNoun() {
        return noun.get(getRandom());
    }

    public static String getVerb() {
        return verb.get(getRandom());
    }

    public static String getAdj() {
        return adj.get(getRandom());
    }

    public static void main(String[] args) throws FileNotFoundException {
        File nounFile = new File("src/Sem2/ScanNFiles/nouns.txt");
        File verbFile = new File("src/Sem2/ScanNFiles/verbs.txt");
        File adjFile = new File("src/Sem2/ScanNFiles/adjectives.txt");
        
        try (Scanner loadAdj = new Scanner(adjFile)) {
            try (Scanner loadVerb = new Scanner(verbFile)) {
                try (Scanner loadNoun = new Scanner(nounFile)) {
                    while (loadAdj.hasNextLine()) {
                        adj.add(loadAdj.nextLine());
                    }
                    while (loadVerb.hasNextLine()) {
                        verb.add(loadVerb.nextLine());
                    }
                    while (loadNoun.hasNextLine()) {
                        noun.add(loadNoun.nextLine());
                    }
                }
            }
        }
        System.out.println("Hi mom! I'm Joe and I'm currently staring at a " + getNoun()
        + " with world class levels of regret. I've been procrastinating on " + getVerb()
        + " because that takes effort, and effort is outright " + getAdj()
        + ", so I'm not going to bother thankfully, because of new advancements in " + getNoun()
        + ", I could confidently say that I don't need to anymore. Now that's more time I could use to be"
        + getVerb() + "in a " + getAdj() + " way.");
        System.out.println("It is now the next day and I'm in a " + getNoun() + " trying to " + getNoun()
        + ", unfortunately, my mother decided to buy me a " + getNoun()
        + " to kickstart my million dollar side hustle of " + getVerb()
        + " for a 42.1% stake in equity. I suppose I should quit my job programming in Java"
        + " and start doing " + getNoun() + ".");
    }
}
