/* Last modified: 2023-04-25 */

package Sem2.Objex;

public class locker {
     
    // Attributes
    String name;
    boolean isOpen;
    boolean isLocked;
    int pin;
    String contents;
    
    // Actions
    public void setPin(int newPin) {
        this.pin = newPin;
        System.out.println("new pin set");
    }

    public void setContents(String newContents) {
        this.contents = newContents;
        System.out.println("New stuffs has been put in ze locker");
    }

    public void open(int pinInput) {
        if (isLocked) {
            System.out.println("Locked: gib pin");
            if(pinInput == pin) {
                isOpen = true;
                System.out.println("Locker is now open");
            } else {
                System.out.println("Hoi! Wrong pin, try again");
            }
            
        } else {
            System.out.println("Locker is now opened");
            isOpen = true;
        }
    }

    public void close() {
        isOpen = false;
        System.out.println("Closed le locker");
    }

    public void getInfo() {
        System.out.print("Locker info:");
        System.out.println("Name: " + name);
        System.out.println("Contents: " + contents);
        System.out.println("Is open: " + isOpen);
        System.out.println("Is locked: " + isLocked);
    }

    // Constructor
    public locker(String name, int pin, String contents) {
        this.name = name;
        this.pin = pin;
        this.contents = contents;
    }

    public static void main(String[] args) {
        locker joesLocker = new locker("142", 1234, "joe's leftover cookie");

        joesLocker.setPin(1234);
        joesLocker.getInfo();

        joesLocker.open(1234);

        locker joellesLocker = new locker("612", 4321, "joelle's expired milk");

        joellesLocker.setPin(121);
        joellesLocker.getInfo();
        joellesLocker.close();


    }
}