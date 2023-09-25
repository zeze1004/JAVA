package chap13;

class ThreadEx8 {
    public static void main(String args[]) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2(); // main 메서드 쓰레드는 우선순위가 5여서, 내에서 생성하는 쓰레드도 자동으로 우선순위 5

        th2.setPriority(7);

        System.out.println("Priority of th1(-) : " + th1.getPriority() ); // 5
        System.out.println("Priority of th2(|) : " + th2.getPriority() ); // 7
        th1.start();
        th2.start();
    }
}

// 우선순위가 높은 th1의 -가 더 우선적으로 출력됨
// 우선순위가 동일하다면 |- 식으로 번갈아가면서 출력할 가능성이 높음
class ThreadEx8_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("-");
            for(int x=0; x < 10000000; x++);
        }
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("|");
            for(int x=0; x < 10000000; x++);
        }
    }
}
