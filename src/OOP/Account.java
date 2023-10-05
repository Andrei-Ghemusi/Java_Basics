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

    public Account(Integer iban, String account_holder, Double balance){
        this.iban = iban;
        this.account_holder = account_holder;
        this.balance =balance;
    }

    public void description(String account_holder, Integer iban, Double balance){
        System.out.printf("The account holder is: %s%n", this.account_holder);
        System.out.printf("The iban is: %d%n", this.iban);
        System.out.printf("The balance is: %f%n", this.balance);
    }

    public void displayBalance(){
        System.out.printf("The account holder %s has a balance of n lei in the account %f%n", this.account_holder, this.balance);
    }

    public void withdraw(double sum){
        if(sum<=this.balance) {
            this.balance -=sum;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double amount) {
        this.balance +=amount;
    }
}
