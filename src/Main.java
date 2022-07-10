public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account("12345", 10000, "Sharan", "sk@gmail.com", 1234567890);
        acc1.withdraw(1000);
        acc1.withdraw(5000);
        acc1.deposit(100);
        acc1.withdraw(10000);
    }
}