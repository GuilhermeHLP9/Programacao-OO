package ex1;

public class LoanItem {
    private int id, daysLoaned;
    private Book book;

    public LoanItem(int id, int daysLoaned, Book book) {
        this.setId(id);
        this.setDaysLoaned(daysLoaned);
        this.setBook(book);
    }

    public LoanItem() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDaysLoaned() {
        return daysLoaned;
    }
    public void setDaysLoaned(int daysLoaned) {
        this.daysLoaned = daysLoaned;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public String toString() {
        return "LoanItem{" +
                "id=" + id +
                ", daysLoaned=" + daysLoaned +
                ", book=" + book +
                '}';
    }
}
