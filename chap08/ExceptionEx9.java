package chap08;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생");
            throw e; // 예외를 발생시킴
            // throw new Exception("고의로 발생"); // 위의 두 줄을 한 줄로 축소 가능
        } catch (Exception e) {
            System.out.println("에러메세지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음");
    }
}
