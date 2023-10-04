package chap13;

class ThreadEx21 {
    public static void main(String args[]) {
        Runnable r = new RunnableEx21();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;

    public  int getBalance() {
        return balance;
    }

    public void withdraw(int money){
        if(balance >= money) { // 잔고(balance)가 출금액(money)보다 많을 경우만 출력
            try { Thread.sleep(1000);} catch(InterruptedException e) {}
            System.out.println("balance: " + balance + " money: " + money);
            /*
            한 개의 쓰레드에서 blance보다 money가 작을 경우 조건문은 통과하지만, 다른 쓰레드가 blance보다 money가 클 경우 잔고가 음수가 될 수 있음
            balance: 1000 money: 300
            balance: 1000 money: 200
            balance:700
            balance:500
            ...
            balance: 100 money: 100
            balance:0
            balance: 0 money: 100
            balance:-100
            * */
            balance -= money;
        }
    }
}

class RunnableEx21 implements Runnable {
    Account acc = new Account();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:"+acc.getBalance());
        }
    }
}
