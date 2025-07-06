/* Last modified: 2023-04-25 */

package Sem2.Objex;

public class PPerson {
    private String fullName;
    private int age;
    private double height;
    private String eyeColor;
    private boolean maritalStat;

    public PPerson(String fName, int ageC, int heightC, String eyeColorC, boolean maritalStat) {
        this.fullName = fName;
        this.age = ageC;
        this.height = heightC;
        this.eyeColor = eyeColorC;
        this.maritalStat = maritalStat;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public boolean getMaritalStat() {
        return this.maritalStat;
    }

    public void setName(String nameIn) {
        this.fullName = nameIn;
    }

    public void setHeight(Double heightIn) {
        this.height = heightIn;
    }
}