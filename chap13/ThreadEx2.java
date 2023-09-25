package chap13;

class ThreadEx2 {
    public static void main(String args[]) throws Exception {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start(); // main 쓰레드가 t1 쓰레드를 위한 호출스택 생성
    }
}

class ThreadEx2_1 extends Thread {
    public void run() {
        throwException(); // 예외발생
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
