public class Newspaper extends Item{
    private String authorName;

    public Newspaper(String iname, String authorName) {
        super(iname);
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }
}
