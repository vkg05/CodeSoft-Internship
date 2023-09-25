import java.util.Scanner;

public class ATM {
    private double balance;
    private Scanner sc;
    

    public ATM() {
        balance = 5000.00; // Initial balance
        sc = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your balance is: Rs " + balance);
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit: Rs ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: Rs ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance. Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        boolean exit = false;

        while (!exit) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = atm.sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
