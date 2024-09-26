public class BankAccount {
    private final int accountNumber;
    private final String accountHolder;


    // Constructor method
    protected BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // Get methods
    private int getAccountNumber() {
        return this.accountNumber;
    }

    private String getAccountHolder() {
        return this.accountHolder;
    }

    // Print info method
    protected void printAccountInfo() {
        System.out.println("Account holder: " + getAccountHolder());
        System.out.println("Account number: " + getAccountNumber());
    }
}