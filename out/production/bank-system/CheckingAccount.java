public class CheckingAccount extends BankAccount{
    protected double balance;
    private double overdraftLimit;


    // Constructor method
    public CheckingAccount(int accountNumber, String accountHolder, double overdraftLimit) {
        super(accountNumber, accountHolder);
        this.overdraftLimit = overdraftLimit;
        this.balance = 0.0;
    }

    // Get methods
    private double getBalance(){
        return this.balance;
    }

    private double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    // Code to make deposits
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit done successfully! Balance: US$" + this.getBalance());
    }

    // Code to make withdraws
    public void withdraw(double amount) {
        if (this.getBalance() >= amount) {
            this.balance -= amount;
            System.out.println("Withdraw done successfully! Current balance: US$" + this.getBalance());
        } else {
            System.out.println("Not enough cash in this account."); // Error treatment
        }
    }

    // Make purchases using overdraft method
    public void useOverdraft(double amount){
        if (getOverdraftLimit() >= amount){
            this.overdraftLimit -= amount;
            System.out.println("Purchase done successfully! Your current limit: US$" + this.getOverdraftLimit());
        } else {
            System.out.println("Not enough limit in this account."); // Error treatment
        }
    }

    // Print the overdraft limit
    public void printAccountInfo(){
        super.printAccountInfo(); // Call the parent class method to print account info
        System.out.println("Balance: US$" + getBalance());
        System.out.println("Credit limit: US$" + getOverdraftLimit());
    }
}