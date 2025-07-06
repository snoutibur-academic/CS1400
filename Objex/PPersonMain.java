/* Last modified: 2023-04-25 */

package Sem2.Objex;

public class PPersonMain {
    public static void main(String[] args) {
        // Person 1
        PPerson p1 = new PPerson("EAgamer", 32, 69, "purple", true);

        System.out.println(p1.getFullName());
        System.out.println("age " + p1.getAge());
        System.out.println("height " + p1.getHeight());
        System.out.println("Eye color " + p1.getEyeColor());
        System.out.println("'Material' status " + p1.getMaritalStat());

        System.out.println("");

        // Person2
        PPerson p2 = new PPerson("Joelle", 16, 42, "null", true);
        System.out.print(p2);

        // Person 1 set
        p1.setName("joeNo");
        p1.setHeight(11248.23);

        System.out.println("Name " + p1.getFullName());
        System.out.println("Height " + p1.getHeight());
    }
}