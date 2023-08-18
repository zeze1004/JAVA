package chap08;

public class ExceptionEx2 {
    public static void main(String args[]) {
        int number = 100;
        int result = 0;

        for(int i=0; i < 10; i++) {
            result = number / (int)(Math.random() * 10); // 랜덤숫자가 0이 나올 때 예외발 Exception in thread "main" java.lang.ArithmeticException: / by zero:
            System.out.println(result);
        }
    }
}
