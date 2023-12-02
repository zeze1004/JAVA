package basic.access.ex1;

public class AceessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicFiend = 1;
        data.publicMethod();

        data.innerAccess(); // innerAccess() 안에는 private 속성도 있지만,
                            // innerAccess()는 AccessData 클래스 내부에 있으므로 클래스 내부의 private 속성에도 접근 가능

        // 같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가

    }
}
