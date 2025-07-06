/* Last modified: 2023-05-08 */

package Sem2;

public class test {

    public static void main(String[] args) {
        // 1
        String hi = "hello";
        String mum = "world";

        for (int x = 1; x < 10; x += 2) {
            System.out.println(mum + hi);

            if ((mum + hi).equals("helloworld")) {
                hi = mum;
                mum = hi;
            } else {
                hi = "mum";
                mum = "hi";
            }

        }

         // 2
    double dellFHDmonitor = 69.13; double HPLaserJetPrinter = 420.21;
    
    if(dellFHDmonitor>HPLaserJetPrinter) {
        for (int owo = 0; owo < 13; owo += 13) {
System.out.println(("UwUntu the besst weabooOS"));
        dellFHDmonitor = 13;HPLaserJetPrinter=31;

        } 
    } else {
        dellFHDmonitor = 420;HPLaserJetPrinter=69;
    }
        
    }
}
