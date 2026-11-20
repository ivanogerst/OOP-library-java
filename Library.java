import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private ArrayList<Patron> patronList;

    public Library() {
        bookCollection = new ArrayList<>();
        patronList = new ArrayList<>();
    }

    public void addBooks(Book addedBook) {

        bookCollection.add(addedBook);
        addedBook.changeStatus(true);

        System.out.println("\nYou've successfully added '" +
                addedBook.title + "' from author '" +
                addedBook.author + "' to the library!");
    }

    public void addPatrons(Patron addedPatron) {

        patronList.add(addedPatron);

        System.out.println("\nYou've successfully added '" +
                addedPatron.getName() + "' as a Patron!");
    }

    public void checkoutToPatron(Book selectedBook, Patron selectedPatron) {

        if (bookCollection.contains(selectedBook) && selectedBook.status) {

            bookCollection.remove(selectedBook);

            selectedPatron.addBooks(selectedBook);

            selectedBook.changeStatus(false);

        } else {
            System.out.println("The book isn't available.");
        }
    }

    public void returnBooks(Book selectedBook, Patron selectedPatron) {

        if (selectedPatron.getBorrowedBooks().contains(selectedBook)) {

            selectedPatron.removeBooks(selectedBook);

            bookCollection.add(selectedBook);

            selectedBook.changeStatus(true);

            System.out.println(selectedPatron.getName() +
                    " successfully returned " +
                    selectedBook.title + " to the library!");

        } else {
            System.out.println("This patron doesn't have that book.");
        }
    }

    public void displayCollection() {

        for (Book book : bookCollection) {
            System.out.println("\n" + book);
        }
    }

    public void displayPatrons() {

        for (int i = 0; i < patronList.size(); i++) {

            Patron patron = patronList.get(i);

            System.out.println("\n\n" + (i + 1) + ". " + patron.getName());

            for (Book book : patron.getBorrowedBooks()) {
                System.out.println("\n" + book);
            }
        }
    }

    public void searchBook(String bookTitle, String bookAuthor) {

        for (Book book : bookCollection) {

            if (book.title.equalsIgnoreCase(bookTitle) ||
                    book.author.equalsIgnoreCase(bookAuthor)) {

                System.out.println(book);
            }
        }
    }
}
