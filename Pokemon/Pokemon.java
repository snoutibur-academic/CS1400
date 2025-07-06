/* Last modified: 2023-04-25 */

package Sem2.Pokemon;

import java.util.Arrays;
import java.util.Random;

public class Pokemon {
    static Random r = new Random();

    String name;
    String species;
    String type;

    int level = 1;
    private int levelProgress = 0;
    private int levelUpGoal = 100;

    boolean shiny;

    int statType;
    public static final String statLBL[] = {
            "HP", "Atk", "Def", "Sp. Atk", "Sp. Def", "Sped", "Total"
    };
    public int baseStat[] = {
        0, 0, 0, 0, 0, 0, 0
    };
    public int ev[] = {
        0, 0, 0, 0, 0, 0, 0
    };
    public int iv[] = {
        0, 0, 0, 0, 0, 0, 0
    };
    public int totalStat[] = {
        0, 0, 0, 0, 0, 0, 0
    };

    // Constructor
    Pokemon(String nameIn, String speciesIn, String typeIn, boolean shinyIn, int levelIn) {
        this.name = nameIn;
        this.species = speciesIn;
        this.type = typeIn;
        this.shiny = shinyIn;
        this.level = levelIn;
    }

    public void loadStats(int[] baseIn, int[] ivIn, int[] evIn) {
        iv = ivIn.clone();
        ev = evIn.clone();
        baseStat = baseIn.clone();
    }

    public void levelUp() {
        if (this.levelProgress > this.levelUpGoal) {
            this.level += 1;
        }
    }

    public void profile() {
        System.out.println(
            name + "'s profile\n" +
            "Species: " + species + ", Type: " + type + ", Shiny: " + shiny + "\n" +
            "Level: " + level + ", Progress: " + levelProgress + " / " + levelUpGoal + " | " + (levelProgress/levelUpGoal) + "%\n" +
            "Stats: " + Arrays.toString(statLBL) + "\n" +
            " Base: " + Arrays.toString(baseStat) + "\n" +
            "   IV: " + Arrays.toString(iv) + "\n" +
            "   EV: " + Arrays.toString(ev) + "\n" +
            "Total: " + Arrays.toString(totalStat)
        );
    }

    public int calcStat(String stat) {
        if(stat.equals("HP")) {
            statType = 0;
        } else if(stat.equals("Atk")) {
            statType = 1;
        } else if(stat.equals("Def")) {
            statType = 2;
        } else if(stat.equals("Sp. Atk")) {
            statType = 3;
        } else if(stat.equals("Sp. Def")) {
            statType = 4;
        }  else if(stat.equals("Sped")) {
            statType = 5;
        }

        return ((2 * baseStat[statType] + iv[statType] + (ev[statType] / 4)) * level ) / 100 + level + 10;
    }
    
    public void calcStatA() {
        for(int statType = 0; statType < 7; statType++) {
            totalStat[statType] = (((2 * baseStat[statType] + iv[statType] + (ev[statType] / 4)) * level) / 100) + level + 10;
        }
    }

    public int calcStatM(int baseIn, int ivIn, int evIn, int levelIn) {
        return (((2 * baseIn + ivIn + (evIn/ 4)) * level) / 100) + level + 10;
    }

}