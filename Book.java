public class Book {

    protected String title;
    protected String author;
    private String identifier;
    protected boolean status;

    public Book(String title, String author, String identifier, boolean status) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
        this.status = status;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void changeStatus(boolean newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Book title: " + title +
                "\tAuthor: " + author +
                "\tStatus: " + (status ? "Available" : "Unavailable");
    }
}
