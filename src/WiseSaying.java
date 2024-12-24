public class WiseSaying {
    private final int id;
    private String comment;
    private String author;

    public WiseSaying(int id, String comment, String author) {
        this.id = id;
        this.comment = comment;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
