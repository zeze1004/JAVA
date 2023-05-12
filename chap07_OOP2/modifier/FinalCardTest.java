package chap07_OOP2.modifier;

class Card {
    final int NUMBER;		        // 접근제이자 final 변수는 상수지만 선언과 함께 초기화 되지 않음
    final String KIND;		        // final 변수는 생성자에서 한 번만 초기화 됨
    static int width  = 100;
    static int height = 250;

    Card(String kind, int num) {    // 매개변수로 넘겨받은 값으로 생성자에서 초기화 됨
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND +" "+ NUMBER;
    }
}

class FinalCardTest {
    public static void main(String args[]) {
        Card c = new Card("HEART", 10);      // kind, num을 매개변수로 넘김
//		c.NUMBER = 5                                    // 생성자에서만 초기화돼서 값을 바꿀 수 없음
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c.toString());
    }
}
