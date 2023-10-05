package OOP;

public class Account {
    // Class Account
    //Attributes: iban, account_holder, balance
    //Constructor for all attributes
    //Methods:
    //● display_balance() - The account holder x has a balance of n lei in the account y
    //● withdraw(amount)
    //● deposit(amount)

    private Integer iban;
    private String account_holder;
    private Double balance;

    public Account(Integer iban, String account_holder, Double balance) {
        this.iban = iban;
        this.account_holder = account_holder;
        this.balance = balance;
    }

    public void accountDetails() {
        System.out.println("Account Details:");
        System.out.printf("Account Holder: %s%n", this.account_holder);
        System.out.printf("IBAN: %d%n", this.iban);
        System.out.printf("Balance: %f%n", this.balance);
    }

    public void displayBalance() {
        System.out.printf("The account holder %s has a balance of %f lei%n", this.account_holder, this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.printf("Withdrawal of %f lei successful. New balance: %.2f lei%n", amount, this.balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Deposit of %f lei successful. New balance: %f lei%n", amount, this.balance);
    }
}