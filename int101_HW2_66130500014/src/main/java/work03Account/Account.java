package work03Account;
import work01Utilitor.Utilitor;
import work02Person.Person;
import work01Utilitor.Utilitor.*;
public class Account {
    private static long nextNo = 1_000_000_000;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person owner) {
        if (owner == null) { throw new NullPointerException(); }
        this.owner = owner;
        this.no = nextNo + Utilitor.computeIsbn10(nextNo);
        nextNo += 10;
        this.balance = 0.0;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        this.balance += Utilitor.testPositive(amount);
        return this.balance;
    }

    public double withdraw(double amount) {
        this.balance = Utilitor.testPositive(this.balance) - Utilitor.testPositive(amount);
        return this.balance;
    }

    public void transfer(double amount, Account account) {
        if (account == null) throw new IllegalArgumentException();
        this.withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account(");
        sb.append(this.no);
        sb.append(",");
        sb.append(this.balance);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }


}
