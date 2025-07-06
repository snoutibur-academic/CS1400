/* Last modified: 2023-04-25 */

package Sem2.Poly;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radIn, double heightIn) {
        super(radIn);
        this.height = heightIn;
    }

    public double getArea() {
        double circlez = 2 *  Math.pow(radius, 2) * Math.PI;
        double walls = 2 * Math.PI * radius * height;
        return circlez + walls;
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(1, 2);

        System.out.println(c1.getArea());
    }
}