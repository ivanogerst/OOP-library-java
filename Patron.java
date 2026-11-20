import java.util.ArrayList;

public class Patron {

    private String name;
    private String patronId;
    private ArrayList<Book> borrowedBooks;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBooks(Book addedBook) {
        borrowedBooks.add(addedBook);

        System.out.println("\nYou've successfully added '" +
                addedBook.title + "' from author '" +
                addedBook.author + "' to your list!");
    }

    public void removeBooks(Book removedBook) {

        if (!borrowedBooks.contains(removedBook)) {
            System.out.println("No borrowed book with that title!");
        } else {
            borrowedBooks.remove(removedBook);

            System.out.println("You've successfully removed '" +
                    removedBook.title + "' from " + name + "'s cart.");
        }
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {

        if (borrowedBooks.isEmpty()) {
            return "Patron has no borrowed books.";
        }

        StringBuilder result = new StringBuilder();

        result.append("\nPatron's name: ").append(name);
        result.append("\nPatron's borrowed books:\n");

        for (Book book : borrowedBooks) {
            result.append(book.title).append("\n");
        }

        return result.toString();
    }
}
