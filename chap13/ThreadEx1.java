package chap13;

class ThreadEx1 {
    public static void main(String args[]) {
        // 쓰레드 생성
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r  = new ThreadEx1_2();
        Thread   t2 = new Thread(r);	  // 생성자 Thread(Runnable target)

        // 쓰레드 실행
        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for(int i=0; i < 5; i++) {
            System.out.println(getName()); // 조상인 Thread의 getName()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for(int i=0; i < 5; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.println(Thread.currentThread().getName()); // Thread 클래스를 상속받으면 메서드 직접호출 가능하지만
                                                                    // Runnable을 구현하면 Thread 클래스의 currentThread()를 참조해야 호출 가능
        }
    }
}

