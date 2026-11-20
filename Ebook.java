public class Ebook extends Book {

    private double sizeMb;

    public Ebook(String title, String author, String identifier,
                 boolean status, double sizeMb) {

        super(title, author, identifier, status);
        this.sizeMb = sizeMb;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tFile size in megabytes: " + sizeMb;
    }
}
