/* Last modified: 2023-05-18 */

package Sem2.li;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Library {
    public static ArrayList<Book> listCheckedOut(ArrayList<Book> booksIn) {
        ArrayList<Book> checkedOutList = new ArrayList<Book>();
        for (int i = 0; i <= booksIn.size() - 1; i++) {
            if (booksIn.get(i).isOut()) {
                checkedOutList.add(booksIn.get(i));
            }
        }
        return checkedOutList;
    }

    public static ArrayList<Book> listAvailable(ArrayList<Book> booksIn) {
        ArrayList<Book> availableList = new ArrayList<Book>();
        for (int i = 0; i <= booksIn.size() - 1; i++) {
            if (!booksIn.get(i).isOut()) {
                availableList.add(booksIn.get(i));
            }
        }
        return availableList;
    }

    // Error Trapping
    public static int intIn() {
        Scanner x = new Scanner(System.in);
        while (!x.hasNextInt()) {
            System.out.println("Invalid input: Only accepts integers.");
            x.next();
        }
        return x.nextInt();
    }

    // Search
    public static int searchTitle(ArrayList<Book> booksIn, String titleIn) {
        int x = -1;
        for (int i = 0; i < booksIn.size(); i++) {
            if (booksIn.get(i).gTitle().equals(titleIn)) {
                x = i;
                return x;
            }
        }
        return x;
    }

    public static void searchTitleN(ArrayList<Book> booksIn, String titleIn) {
        System.out.println("Search Results for title: " + titleIn + ": ");
        for (int i = 0; i < booksIn.size(); i++) {
            if (booksIn.get(i).gTitle().equals(titleIn)) {
                System.out.println(booksIn.get(i));
            }
        }
    }

    public static void searchAuthor(ArrayList<Book> booksIn, String authorIn) {
        System.out.println("Search Results for author: " + authorIn + ": ");

        for (int i = 0; i < booksIn.size(); i++) {
            if (booksIn.get(i).gAuthor().equals(authorIn)) {
                System.out.println(booksIn.get(i));
            }
        }
    }

    public static int searchUser(ArrayList<Client> clientsIn, String userIn) {
        int x = -1;
        for (int i = 0; i < clientsIn.size(); i++) {
            if ((clientsIn.get(i).gUserName()).equals(userIn)) {
                x = i;
            }
        }
        return x;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int temp1i;
        int actionI;
        String actionS;
        String user;
        int UserI = -1;
        ArrayList <Book> avaliableBooks = new ArrayList<Book>(); // Used to store available books, checked out books are stored in clients.x

        // Import books from file - used to store every book, so checked out books still exist
        File bFile = new File("src/Sem2/li/Library.txt");
        Scanner fIn = new Scanner(bFile);
        ArrayList<Book> books = new ArrayList<Book>();
        while (fIn.hasNextLine()) {
            Book temp = new Book(fIn.next(), fIn.next(), fIn.next(), fIn.next(), fIn.nextDouble());
            books.add(temp);
        }

        // Import clients from file
        File cFil = new File("src/Sem2/li/Clients.txt");
        Scanner fIn2 = new Scanner(cFil);
        ArrayList<Client> clients = new ArrayList<Client>();
        while (fIn2.hasNextLine()) {
            Client temp = new Client(fIn2.next(), fIn2.next(), fIn2.next());
            clients.add(temp);
        }

        // Main menu
        while (true) {
            // Refresh
            avaliableBooks = listAvailable(books);

            System.out.println(
                    "\n0===|=======================>\nWat you want:\n1: Check in or out a book\n2: Search for a book\n3: Your profile\n4: See all books");
            actionI = intIn();
            
            // Checking in and out
            if (actionI == 1) {
                System.out.print("\nLogin as user: ");
                user = in.next();
                if(searchUser(clients, user) != -1) {
                    System.out.println("\nHiya " + user);
                    UserI = searchUser(clients, user);

                    while (true) {
                        System.out.println("\n1: Check in\n2: Check out\nOther number to exit.\n");
                        actionI = intIn();
                        if (actionI == 1) {
                            System.out.println("Here's the books in your possession: "
                                    + (clients.get(UserI).booksCheckedOut)
                                    + "\nWat book would you like to check in?");
                            actionS = in.next();
                                    
                            if(searchTitle(clients.get(UserI).booksCheckedOut, actionS) != -1) {
                                temp1i = searchTitle(clients.get(UserI).booksCheckedOut, actionS);
                                clients.get(UserI).booksCheckedOut.get(temp1i).checkOut(user);
    
                                avaliableBooks.add(clients.get(UserI).booksCheckedOut.get(temp1i));
                                clients.get(UserI).booksCheckedOut.remove(temp1i);
                                
                            } else {
                                System.out.println("You don't got that!");
                            }
    
    
                        } else if (actionI == 2) {
                            System.out.println("Wat book would you like to check out?");
                            actionS = in.next();
                            if(searchTitle(avaliableBooks, actionS) != -1) {
                                temp1i = searchTitle(avaliableBooks, actionS);
                                avaliableBooks.get(temp1i).checkOut(user);
    
                                clients.get(UserI).booksCheckedOut.add(avaliableBooks.get(temp1i));
                                avaliableBooks.remove(avaliableBooks.get(temp1i));
                                
                            } else {
                                System.out.println("That book isn't available.");
                            }
    
                        } else {
                            System.out.println("Exit");
                            break;
                        }
                    }
                } else {
                    System.out.println("That user doesn't exist!");
                }

            // Searching
            } else if (actionI == 2) {
                while (true) {
                    System.out.println(
                            "\nSearch for a book by:\n 1: Title | 2: Author\n Note, search is case sensitive.\nOther number to exit.");
                    actionI = intIn();
                    if (actionI == 1) {
                        System.out.print("Enter title: ");
                        actionS = in.next();
                        searchTitleN(books, actionS);
                    } else if (actionI == 2) {
                        System.out.print("Enter author: ");
                        actionS = in.next();
                        searchAuthor(books, actionS);
                    } else {
                        System.out.println("Exit");
                        break;
                    }
                }

            //Profiles
            } else if (actionI == 3) {
                System.out.print("\nUsername of the profile you're after: ");
                actionS = in.next();
                System.out.println(clients.get(searchUser(clients, actionS)).profile() + "\nEnter 1 to enter your birtdate.");
                if(intIn() ==  1) {
                    System.out.println("Wat ya birthdate (day, month, year):");
                    int day = intIn();
                    int month = intIn();
                    int year = intIn();

                    clients.get(searchUser(clients, actionS)).setBday(day, month, year);
                }

            }

            // See all
            else if(actionI == 4) {
                System.out.print("\n1: See all avaliable\n2: See all checked out\n");
                actionI = intIn();
                if(actionI == 1) {
                    System.out.println("Here's every book in the library:");
                    System.out.println(avaliableBooks.toString());
                } else if(actionI == 2) {
                    System.out.println("\nHere's every book checked out:");
                    System.out.println(listCheckedOut(books));
                }
                
                
            }
        }
    }
}