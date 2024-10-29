public class Book {
    private final String title;
    private final Author author;
    private final int yearPublication;

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }
    public String getTitle() {
        return this.title;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }

}
