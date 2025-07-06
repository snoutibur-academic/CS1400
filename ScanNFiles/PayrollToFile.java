/* Last modified: 2023-04-25 */

package Sem2.ScanNFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PayrollToFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("The Payroll Machine :trademark:");

            System.out.println("Gib name pls");
            String name = in.nextLine();
            PrintWriter pw = new PrintWriter(name + "'s payroll.txt");

            System.out.println("How much bank an hour?");
            double rate = in.nextDouble();
            
            System.out.println("How long da grind?");
            double hrs = in.nextDouble();
            
            double pay = rate*hrs;

            pw.println(name + "'s payroll!!");
            pw.println("Rate: " + rate);
            pw.println("Hours Worked " + hrs);
            pw.println("Pay: " + pay);
            pw.close();
        }
        System.out.println("Alright, payroll file has been created.");

    }
}
