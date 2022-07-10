public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private long phoneNumber;

    // We have performed constructor overloading.
    public Account() {
        this("Unknown", "unknown@gmail.com", 000000000);
    }

    public Account(String customerName, String customerEmail, long phoneNumber) {
        this("99999", 0.0, customerName, customerEmail, phoneNumber);
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of amount " + amount + " added successful. Current Balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Account not have sufficient balance. Available balance is " + this.balance);
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawal of amount " + amount + " is successful. Current Balance is " + this.balance);
    }
}
