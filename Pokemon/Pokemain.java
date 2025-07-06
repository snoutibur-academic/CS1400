/* Last modified: 2023-04-25 */

package Sem2.Pokemon;

public class Pokemain {
    public static void main(String[] args) {
        Garchomp g1 = new Garchomp("G-PAIN", false, 0);
        Pikachu p1 = new Pikachu("Painkachu", true, 621);
        Pokemon[] team = new Pokemon[] {g1, p1};

        System.out.println(team[0]);
    }
}