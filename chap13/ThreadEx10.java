package chap13;

class ThreadEx10 implements Runnable  {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        //t.setDaemon(true);		// 데몬쓰레드 생성, 데몬쓰레드를 생성하지 않으면 autoSave()가 3초마다 실행되어 프로그램이 종료되지 않음
        t.start();

        for(int i=1; i <= 10; i++) {
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
            System.out.println(i);

            if(i==5)
                autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000);	// 3초마다
            } catch(InterruptedException e) {}

            // autoSave의 값이 true이면 autoSave()를 호출, i가 8일 때(5 출력 후 3초가 지난 후) 한 번 더 실행됨
            if(autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}