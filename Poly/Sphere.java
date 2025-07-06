/* Last modified: 2023-04-25 */

package Sem2.Poly;

public class Sphere extends Circle{
    public Sphere(double radIn) {
        super(radIn);
    }
    
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Sphere s1 = new Sphere(21);

        System.out.println(s1.getArea());
    }
}
