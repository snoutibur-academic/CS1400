/* Last modified: 2023-04-25 */

package Sem2.Objex;

import java.util.Scanner;

public class square {

    public double length;

    public double getArea() {
        return length * length;
    }
    
    public square(double legnthIn) {
        this.length = legnthIn;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Gib square legnth:");
            square anSquareThing = new square(input.nextDouble());
            System.out.println("Area: " + anSquareThing.getArea());
        }
    }
}   