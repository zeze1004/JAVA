package basic.access.ex2;

import basic.access.ex1.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        // public 호출 가능
        AccessData data = new AccessData();
        data.publicMethod();


        // 다른 패키지 default 호출 불가
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가
        // data.privateField;
        // data.privateMethod();
    }
}
