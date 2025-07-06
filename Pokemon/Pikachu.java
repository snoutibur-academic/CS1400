/* Last modified: 2023-04-25 */

package Sem2.Pokemon;

public class Pikachu extends Pokemon {
    // "HP", "Atk", "Def", "Sp. Atk", "Sp. Def", "Sped"

        public static final Integer PikStat[] = {
            35, 55, 30, 50, 40, 90
    };
        public static Integer PikaIV[] = {
            13, 6, 21, 3, 4, 2
    };
        public static Integer PikaEV[] = {
            69, 42, 13, 21, 66, 32
    };

    public Pikachu(String nameIn, boolean shinyIn, int levelIn) {
        super(nameIn, "Pikachu", "Electric", shinyIn, levelIn);
    }
}