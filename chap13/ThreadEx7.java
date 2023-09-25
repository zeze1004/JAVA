package chap13;

import javax.swing.*;

public class ThreadEx7 {
    public static void main(String[] args) throws Exception {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}
// 값을 입력 받는 쓰레드와 숫자를 출력하는 쓰레드가 달라서 입력을 받지 않아도 숫자 출력됨
class ThreadEx7_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1초간 시간을 지연함
            } catch (Exception e) {}
        }
    }
}
