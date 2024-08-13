package Bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // 생성자 함수
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 예금
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // 출금
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // 잔액확인
    public double getBalance() {
        return balance;
    }
}
