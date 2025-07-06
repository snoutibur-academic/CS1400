/* Last modified: 2023-04-25 */

package Sem2.Poly;

public class Box extends Rectangle{
    double height;

    public Box(double lengthIn, double widthIn, double heightIn) {
        super(lengthIn, widthIn);
    
        this.height = heightIn;
    }

    public double getArea() {
        return 2 * (width * length + height * length + height * width); 
    }

    public static void main(String[] args) {

        Box b1 = new Box(1, 1, 1);
        
        System.out.println(b1.getArea());
    }
}