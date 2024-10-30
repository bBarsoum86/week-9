import java.util.ArrayList;


public class LibraryDriver {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("guide river fishing");
        Book book2 = new Book ("intro to java","smith",9.99 );
        books.add(book1);
        books.add(book2);
        //todo add 2 new books to the arraylist

        Book book3 = new Book("Egypt","bishoy",20.00);
        Book book4 = new Book ("Kamasutra","Bishoy",11.99 );
        books.add(book3);
        books.add(book4);

        System.out.println("here are the book in the list:");
        for (Book book: books) {
            book.printBookDetails();
            System.out.println();
        }
        System.out.println("updated details:");
        for(Book book : books){
            book.printBookDetails();
            System.out.println();
        }
    }//end main method
}
