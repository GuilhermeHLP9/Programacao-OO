package ex1;

public class Book {
    private int id;
    private String title, author;

    public Book(int id, String author, String title) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
    }

    public Book() {
        this.title = "No Title";
        this.author = "No Author";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
