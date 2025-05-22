import java.util.Scanner;

class Account {
    String accountName;
    String accountNumber;
    private double accountAmount;

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    public Account (String accountName, String accountNumber, double accountAmount) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    public Account () {
        this.accountName = "Sarankirthic";
        this.accountNumber = "IDEA0001";
        this.accountAmount = 1000000;
    }

    public static void accountDetails(Account account) {
        System.out.println("#############################################");
        System.out.println("Account Details");
        System.out.println("Account Name" + account.accountName);
        System.out.println("Account Number" + account.accountNumber);
        System.out.println("Account Amount" + account.getAccountAmount());
        System.out.println("#############################################");
    }

    // Answer for part C
    public static void checkBalance(Account account) {
        System.out.println("Account balance is: ");
        System.out.println(account.getAccountAmount());
    }

    // Answer for part A
    public static void deposit(Account account, double amount) {
        account.setAccountAmount(account.getAccountAmount() + amount);
        System.out.println("Deposit amount is: " + amount);
        checkBalance(account);
    }

    // Answer for part B
    public static void withdraw(Account account, double amount) {
        account.setAccountAmount(account.getAccountAmount() - amount);
        System.out.println("Withdraw amount is: " + amount);
        checkBalance(account);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Account account = new Account();
//        Account[] accounts = new Account[1];
        Scanner scanner = new Scanner(System.in);

//        for(int i = 0; i < accounts.length; i++) {
//            accounts[i] = new Account();
//            accounts[i].accountName = scanner.nextLine();
//            accounts[i].accountNumber = scanner.nextLine();
//            accounts[i].setAccountAmount(scanner.nextDouble());
//        }
        Account.checkBalance(account);
        System.out.println("Enter ammount to deposit: ");
        int depositAmount = scanner.nextInt();
        Account.deposit(account, depositAmount);
        System.out.println("Enter ammount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        Account.withdraw(account, withdrawAmount);
    }
}
