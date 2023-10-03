package work04;

public class work04UseOfUtilityClass {
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person(1);

        // Create a BankAccount for the person
        BankAccount account = new BankAccount(101, person);

        // Deposit and check balance
        account.deposit(1000.0);
        System.out.println("Balance: " + account.getBalance());

        // Withdraw and check balance
        account.withdraw(500.0);
        System.out.println("Balance: " + account.getBalance());

        // Create another person and account
        Person anotherPerson = new Person(2);
        BankAccount anotherAccount = new BankAccount(102, anotherPerson);

        // Transfer money between accounts
        account.transfer(200.0, anotherAccount);
        System.out.println("Account 1 Balance: " + account.getBalance());
        System.out.println("Account 2 Balance: " + anotherAccount.getBalance());

        // Display account information
        System.out.println(account);
        System.out.println(account.getOwner());
        System.out.println(account.getBalance());

        System.out.println(anotherAccount);
        System.out.println(anotherAccount.getOwner());
        System.out.println(anotherAccount.getBalance());
    }
}
