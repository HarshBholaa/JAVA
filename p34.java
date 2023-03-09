package Daily_Practice;

import org.w3c.dom.css.CSSStyleRule;

import java.util.Scanner;

class Library {
    String []books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    public void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added.!");
    }
    public void showAvailableBooks(){
        System.out.println("Available Books: ");
        for (String bok: this.books) {
            if(bok==null){
                break;
            }
            System.out.println("* "+bok);
        }

    }
}
public class p34 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library obj = new Library();
        obj.addBook("Java basic");
        obj.addBook("C++ basic");
        obj.addBook("Python basic");
        obj.showAvailableBooks();

    }
}
