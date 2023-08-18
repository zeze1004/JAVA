package chap06_OOP1.constructor;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) { 	// 매개변수가 있는 생성자.
        value = x;
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();             // 이미 정의되어 있는 생성자 없으므로 컴파일러가 기본 생성자 추가
//        Data2 d2 = new Data2();		    // compile error발생
        Data2 d2 = new Data2(10);        // 위에 Data2(int x)를 명시했으므로 매개변수를 추가해야함
                                            // 매개변수를 통해 인스턴스마다 각기 다른 값으로 초기화 가능
    }
}
