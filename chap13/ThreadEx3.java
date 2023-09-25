package chap13;

class ThreadEx3 {
    public static void main(String args[]) throws Exception {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run(); // main 호출스택에 run() 실행
    }
}

class ThreadEx3_1 extends Thread {
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
