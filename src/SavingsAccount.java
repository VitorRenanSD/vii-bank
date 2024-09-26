public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double savingsBalance;


    // Constructor method
    public SavingsAccount(int accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
        this.interestRate = 2.0; // 2% interest rate
        this.savingsBalance = 0.0;
    }

    // Get method
     private double getSavingsBalance(){
        return this.savingsBalance;
    }

    private double getInterestRate() {
        return this.interestRate;
    }

    // Set interest rate
    protected void setInterestRate(double value){
        this.interestRate = value;
        System.out.println("New interest rate: " + getInterestRate() + "%");
    }

    // Deposit into savings account
    public void deposit(double amount) {
        this.savingsBalance += amount;
        System.out.println("Deposit done successfully! Savings balance: US$" + this.savingsBalance);
    }

    // Apply interest into the total amount
    public void applyInterest(){
        double interest = this.savingsBalance * (this.getInterestRate() / 100); // Calculates the interest amount in %
        this.savingsBalance += interest;
        System.out.print("Applying interest rate... ");
        System.out.println("Balance: US$" + getSavingsBalance());
    }

    // Transfer amount to your checking account
    public void transfer(CheckingAccount destination, double amount){
        if (this.savingsBalance >= amount){ // if it has enough cash...
            this.savingsBalance -= amount; // Subtract the amount

            destination.balance += amount; // Deposit in the destination

            System.out.println("Transfer successful! Transferred amount: US$" + amount);
        } else {
            System.out.println("Not enough balance in savings account for this transfer.");
        }
    }
    // Print the savings amount
    public void printAccountInfo() {
        super.printAccountInfo();
        System.out.println("Current interest rate: " + this.interestRate + "%");
        System.out.println("Savings amount: US$" + getSavingsBalance());
    }
}