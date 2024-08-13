package Bank;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123-123-123", 0);
        BankAccount account2 = new BankAccount("001-002-003", 0);
        account1.deposit(1000);
        account2.deposit(500);
        account1.withdraw(90);
        account2.withdraw(450);
        System.out.println("Account1의 잔액 : " + account1.getBalance()); // 910.0
        System.out.println("Account2의 잔액 : " + account2.getBalance()); // 50.0
    }
}
