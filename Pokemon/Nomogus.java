/* Last modified: 2023-04-25 */

package Sem2.Pokemon;

public class Nomogus extends Pokemon {
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

    public Nomogus(String nameIn, boolean shinyIn, int levelIn) {
        super(nameIn, "Nomogus", "Unknown", shinyIn, levelIn);
    }

    public static void main(String[] args) {
        Nomogus n1 = new Nomogus("nOwO", false, 78);
        n1.loadStats(GarBStat, GarIV, GarEV);
        n1.calcStatA();
        n1.profile();
        System.out.println(n1.calcStat("HP")
        + "\nManual: " + n1.calcStatM(108, 24, 74, 78));
    }
}