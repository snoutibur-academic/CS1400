/* Last modified: 2023-04-25 */

package Sem2.Objex;

public class Person {
    // Person thingy
    String fullName;
    int age;
    double height;
    String eyeColor;
    boolean maritalStat;


    // Constructor
    public Person(String fName, int ageC, int heightC, String eyeColorC, boolean maritalStat) {
        this.fullName = fName;
        this.age = ageC;
        this.height = heightC;
        this.eyeColor = eyeColorC;
        this.maritalStat = maritalStat;
    }

    public static void main(String[] args) {

        // Person 1
        Person p1 = new Person("EAgamer", 32, 69, "purple", true);

        System.out.println(p1.fullName);
        System.out.println("age" + p1.age);
        System.out.println("height" + p1.height);
        System.out.println("Eye color"+ p1.eyeColor);
        System.out.println("Material status " + p1.maritalStat);

        System.out.println("");

        // Person2
        Person p2 = new Person("Joelle", 16, 42, "null", true);
        System.out.print(p2);
    }
}