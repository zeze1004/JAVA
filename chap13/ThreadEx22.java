package chap13;

public class ThreadEx22 {
    public static void main(String args[]) {
        Runnable r = new RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account2 {
    private int balance = 1000;                   // 동기화시 public으로 하면 외부해서 값을 변경해도 막을 수 없음

    public  int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money){ // synchronized로 메서드 동기화, 해당 메서드만 private된 변수 값에 접근할 수 있음
        if(balance >= money) {                    // 잔고(balance)가 출금액(money)보다 많을 경우만 출력
            try { Thread.sleep(1000);} catch(InterruptedException e) {}
            System.out.println("balance: " + balance + " money: " + money);
            balance -= money;
        }
    }
}

class RunnableEx22 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:"+acc.getBalance());
        }
    }
}
