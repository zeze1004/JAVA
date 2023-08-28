package chap09;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);       // Integer 객체 생성되어 메모리 추가 사용
        Integer i2 = Integer.valueOf(100);      // 컴파일러가 wrapper 클래스로 반환해줌, 권장되는 방식
        Integer i3 = Integer.valueOf(10);

        System.out.println("i == i2: " + (i == i2));                    // false
        System.out.println("i.equals(i2): " + (i.equals(i2)));          // true
        System.out.println("i.compareTo(i2): " + (i.compareTo(i2)));    // 같음: 0
        System.out.println("i.compareTo(i3): " + (i.compareTo(i3)));    // 다름: 1
        System.out.println("i.toString(): " + i.toString());            // 100
    }
}
