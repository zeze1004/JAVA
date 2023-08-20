package chap07_OOP2;

class SuperTest2 {
    public static void main(String args[]) {
        Child2 c = new Child2();
        c.method();
    }
}
class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    int x = 20; // 조상 클래스 멤버변수와 중복정의

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x); // 자기 클래스 멤버변수
        System.out.println("super.x = "+ super.x); // 조상 클래스 멤버변수
    }
}
