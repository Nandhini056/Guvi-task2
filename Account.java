public class Account {
    private double balance;
    public Account() {
        this.balance = 0.0;
    }
    public Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }


    public static void main(String[] args) {
        Account account1 = new Account(); // Using no-argument constructor
        Account account2 = new Account(500.0); // Using constructor with initial balance

        account1.displayBalance();
        account1.deposit(200.0);
        account1.displayBalance();

        account2.displayBalance();
        account2.withdraw(100.0);
        account2.displayBalance();
    }
}
