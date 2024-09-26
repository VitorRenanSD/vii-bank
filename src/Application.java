import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert your full name: ");
        String fullName = scanner.nextLine();

        // Create account object
        CheckingAccount checkingAccount = new CheckingAccount(122750, fullName, 1500.00);
        SavingsAccount savingsAccount = new SavingsAccount(222750, "SAVINGS " + fullName);
        int option;

        System.out.println("\nWELCOME TO VII'S BANK!");
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit into Checking Account");
            System.out.println("2. Withdraw from Checking Account ");
            System.out.println("3. Purchase using Overdraft");
            System.out.println("--------------------------------------");
            System.out.println("4. Deposit into Savings Account");
            System.out.println("5. Transfer cash to Checking Account");
            System.out.println("6. Apply interest to Savings Account");
            System.out.println("--------------------------------------");
            System.out.println("7. See information about your Checking Account");
            System.out.println("8. See information about your Savings Account");
            System.out.println("9. Exit");
            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Value to deposit into Checking Account: US$");
                    double depositAmount = scanner.nextDouble();
                    checkingAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Value to withdraw from Checking Account: US$");
                    double withdrawAmount = scanner.nextDouble();
                    checkingAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Value to use from Overdraft: US$");
                    double overdraftAmount = scanner.nextDouble();
                    checkingAccount.useOverdraft(overdraftAmount);
                    break;
                case 4:
                    System.out.print("Value to deposit into Savings Account: US$");
                    double savingsDeposit = scanner.nextDouble();
                    savingsAccount.deposit(savingsDeposit);
                    break;
                case 5:
                    System.out.print("Value to transfer from Savings Account: US$");
                    double transferAmount = scanner.nextDouble();
                    savingsAccount.transfer(checkingAccount, transferAmount);
                    break;
                case 6:
                    savingsAccount.applyInterest();
                    break;
                case 7:
                    System.out.println("--------------------------------------");
                    checkingAccount.printAccountInfo();
                    break;
                case 8:
                    savingsAccount.printAccountInfo();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (option != 9);

        scanner.close();
    }
}
