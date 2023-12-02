package basic.access.ex1;

public class AccessData {

    public int publicFiend;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicFiend);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    // 클래스 내부에서 직접 접근하는건 모두 오케이
    public void innerAccess() {
        System.out.println("내부 호출");
        publicFiend = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
