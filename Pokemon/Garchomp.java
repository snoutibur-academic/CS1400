/* Last modified: 2023-04-25 */

package Sem2.Pokemon;

public class Garchomp extends Pokemon {
    // "HP", "Atk", "Def", "Sp. Atk", "Sp. Def", "Sped", "Total"

    private static final int GarBStat[] = {
            108, 130, 95, 80, 85, 102, 600
    };
    private static int GarIV[] = new int[] {
            24, 12, 30, 16, 23, 5, 110
    };
    private static int GarEV[] = {
            74, 190, 91, 48, 84, 23, 510
    };

    public Garchomp(String nameIn, boolean shinyIn, int levelIn) {
        super(nameIn, "Garchomp", "Unknown", shinyIn, levelIn);
    }

    public static void main(String[] args) {
        Garchomp g1 = new Garchomp("nOwO", false, 78);
        g1.loadStats(GarBStat, GarIV, GarEV);
        g1.calcStatA();
        g1.profile();
        System.out.println(g1.calcStat("HP")
        + "\nManual: " + g1.calcStatM(108, 24, 74, 78));
    }
}