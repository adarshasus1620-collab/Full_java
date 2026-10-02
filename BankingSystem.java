// Complex Java Program Example: Multithreaded Banking System
class BankAccount {
    private int balance = 1000;

    // synchronized ensures thread safety
    public synchronized void withdraw(int amount, String threadName) {
        if (balance >= amount) {
            System.out.println(threadName + " is withdrawing " + amount);
            try {
                Thread.sleep(100); // simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(threadName + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(threadName + " tried to withdraw " + amount + " but insufficient funds!");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawalThread extends Thread {
    private BankAccount account;
    private int amount;

    WithdrawalThread(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount, getName());
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Multiple threads trying to withdraw simultaneously
        WithdrawalThread t1 = new WithdrawalThread(account, 500, "Thread-1");
        WithdrawalThread t2 = new WithdrawalThread(account, 700, "Thread-2");
        WithdrawalThread t3 = new WithdrawalThread(account, 300, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

