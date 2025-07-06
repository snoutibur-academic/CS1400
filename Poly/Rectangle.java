/* Last modified: 2023-04-25 */

package Sem2.Poly;

import Sem2.Objex.square;

public class Rectangle extends square {
    
    double width;
    
    public Rectangle(double legnthIn, double widthIn) {
        super(legnthIn);
        this.width = widthIn;
    }

    public double getArea() {
        return width * length;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        r1.getArea();
    }
}
