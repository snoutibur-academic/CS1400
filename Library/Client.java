/* Last modified: 2023-04-29 */

package Sem2.li;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    private String userName;
    private String fname;
    private String lname;
    private LocalDate birthDate;
    public ArrayList<Book> booksCheckedOut = new ArrayList<>();

    public Client(String unameIn, String fNameIn, String lNameIn) {
        this.userName = unameIn;
        this.fname = fNameIn;
        this.lname = lNameIn;
    }
    
    // Setters
    public void setBirthDate(LocalDate birthDateIn) {
        this.birthDate = birthDateIn;
    }
    public void setFname(String fnameIn) {
        this.fname = fnameIn;
    }
    public void setLname(String lnameIn) {
        this.lname = lnameIn;
    }
    public void setBday(int dayIn, int monthIn, int yearIn) {
        this.birthDate = LocalDate.of(yearIn, monthIn, dayIn);
    }

    // Getters
    public String profile() {
        return userName + "'s profile. Real name: "+ fname + " " +  lname + "\nBirthdate: " + birthDate + "\nCurrently has these books checked out: " + booksCheckedOut;
    }
    public String gUserName() {
        return this.userName;
    }

    public String gFullName() {
        return this.fname + " " + this.lname;
    }
    public LocalDate gBirthDate() {
        return this.birthDate;
    }
}