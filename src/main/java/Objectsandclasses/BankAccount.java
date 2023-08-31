package Objectsandclasses;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + " into your account");
        } else {
            System.out.println("The deposit amount is invalid");
        }

    }

    public void withdraw(int amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdraw of $" + amount + " is successful");
        } else {
            System.out.println("Withdraw amount is not valid");
        }
    }

    public void displaybalance() {
        System.out.println(this.balance);
    }

    public void displayinfo() {
        System.out.println("Acount number:" + accountNumber);
        System.out.println("Acount Holder Name:" + accountHolderName);
        System.out.println("Account Balance:" + balance);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BankAccount Person1 = new BankAccount("1212232323", "Akhilendra Sirikonda", 500);
        Person1.displayinfo();
        Person1.deposit(500);
        Person1.withdraw(200);
        Person1.displaybalance();

        BankAccount firstAccount = new BankAccount("12345", "First Account", 1000);
        BankAccount secondAccount = new BankAccount("67890", "Second Account", 1000);
        firstAccount.deposit(500);
        secondAccount.withdraw(200);
        firstAccount.displayinfo();
        secondAccount.displayinfo();
    }

}