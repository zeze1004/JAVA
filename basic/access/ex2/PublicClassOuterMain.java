package basic.access.ex2;

import basic.access.ex1.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 디폴트 접근제어자 클래스는 외부 패키지에서 호출할 수 없음
        // DefaultClass1 defaultClass1 = new DefaultClass1();
        // DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
