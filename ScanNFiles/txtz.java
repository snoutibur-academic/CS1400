/* Last modified: 2023-04-25 */

package Sem2.ScanNFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class txtz {
    public static void main(String[] args) throws FileNotFoundException {
        File names = new File("Semester 2/Scannis n Files/src/nums.txt");
        try (Scanner nameIn = new Scanner(names)) {
            File numbers = new File("Semester 2/Scannis n Files/src/names.txt");
            try (Scanner numIn = new Scanner(numbers)) {
                while (numIn.hasNextLine()) {
                    System.out.println(nameIn.nextLine() + " : " + numIn.nextLine());
                }
            }
        }
    }
}