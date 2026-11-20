public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(
                "The Hidden Grove", "Lana Rivers", "ID001", true);

        Book book2 = new Book(
                "Echoes in the Fog", "Miles Kendrick", "ID002", true);

        Ebook ebook1 = new Ebook(
                "Virtual Horizons", "Nia Monroe", "E001", true, 5.4);

        Patron patron1 = new Patron("Alice", "P001");
        Patron patron2 = new Patron("Bob", "P002");

        Library library = new Library();

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(ebook1);

        library.addPatrons(patron1);
        library.addPatrons(patron2);

        System.out.println("\nCurrent Library Collection:");
        library.displayCollection();

        System.out.println("\nChecking out a book to Alice...");
        library.checkoutToPatron(book1, patron1);

        System.out.println("\nLibrary Collection After Checkout:");
        library.displayCollection();

        System.out.println("\nPatron Info:");
        library.displayPatrons();

        System.out.println("\nSearching for books by author 'Miles Kendrick':");
        library.searchBook("", "Miles Kendrick");

        System.out.println("\nReturning book to library...");
        library.returnBooks(book1, patron1);

        System.out.println("\nLibrary Collection After Return:");
        library.displayCollection();
    }
}
