package ex1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Loan {
    private int id;
    private Date date;
    //Associação de agregação
    private Student student;
    //Associação de composição
    private List<LoanItem> loanItems;

    public Loan() {
        this.setDate(new Date());
        this.loanItems = new ArrayList<LoanItem>();
        this.setStudent(new Student());
    }

    public Loan(int id, Date date, Student student) {
        this.setId(id);
        this.setDate(new Date());
        this.setStudent(student);
        this.loanItems = new ArrayList<LoanItem>();
    }

    public List<LoanItem> getLoanItems() {
        return loanItems;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public void addLoanItems(int id, int daysLoaned, Book book) {
        this.loanItems.add(new LoanItem(id, daysLoaned, book));
    }

    public String toString() {
        return "\nLoan{" +
                "id=" + id +
                ", date=" + date +
                ", student=" + student +
                ", loanItems=" + loanItems +
                '}';
    }
}
