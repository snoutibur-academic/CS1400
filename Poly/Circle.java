/* Last modified: 2023-04-25 */

package Sem2.Poly;

public class Circle {
    double radius;
    
    public Circle(double radIn) {
        this.radius = radIn;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(13);
        
        System.out.println(c1.getArea());
    }
}