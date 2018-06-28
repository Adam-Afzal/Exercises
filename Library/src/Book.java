public class Book extends Item {

    private String Author;

    public Book(String iname, String book_name) {
        super(iname);
        this.Author = book_name;
    }

    public String getAuthor() {
        return this.Author;
    }
}
