package chap09;
import java.math.*;

public class BigIntegerEx {
    public static void main(String[] args) throws Exception {
        BigInteger bigInteger_int = new BigInteger("123456");

        //n진수 문자열로 생성
        BigInteger bigInteger_str = new BigInteger("FFFF", 16);

        //valueOf 생성
        BigInteger bigInteger_val = BigInteger.valueOf(123456);

        // 매서드를 이용한 연산
        BigInteger Num = new BigInteger("3");
        System.out.println("3+3="+Num.add(BigInteger.valueOf(3)));
        System.out.println("3-3="+Num.subtract(BigInteger.valueOf(3)));
        System.out.println("3*3="+Num.multiply(BigInteger.valueOf(3)));
        System.out.println("3/3="+Num.divide(BigInteger.valueOf(3)));
        System.out.println("3%3="+Num.mod(BigInteger.valueOf(3)));
    }
}
