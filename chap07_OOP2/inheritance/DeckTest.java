package chap07_OOP2.inheritance;

class DeckTest {
    public static void main(String args[]) {
        Deck d = new Deck();	        // 카드 한 벌(Deck) 생성
        Card c = d.pick(0);	    // 섞기 전에 제일 위의 카드 뽑음, shuffle() 전에 deck 의 첫번째 카드는 spade 1
//        d.pick(0);              // Card 클래스의 참조변수 c가
        System.out.println(c);          // System.out.println(c.toString());과 같다.

        d.shuffle();			        // 카드를 섞음
        c = d.pick(0);		    // 섞은 후에 제일 위의 카드를 뽑음
        System.out.println(c);

//        System.out.println(new Card()); // 출력: kind : SPADE, number : 1
    }
}

// Deck클래스
// Card 클래스를 재사용하므로 포함관계
class Deck {
    final int CARD_NUM = 52;	// 카드의 개수
    Card cardArr[] = new Card[CARD_NUM];  // Card 객체 배열을 포함
                                          // Card 인스턴스를 인덱스 52개수의 배열에 생성
                                          // 인덱스 한 칸마다 랜덤한 카드 저장

    Deck() {	// Deck의 카드를 초기
        int i=0;

        for(int k=Card.KIND_MAX; k > 0; k--)
            for(int n=0; n < Card.NUM_MAX ; n++)
                cardArr[i++] = new Card(k, n+1);    // Card 객체 배열 문양이랑 카드 숫자 입력
    }

    Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick() {			// Deck에서 카드 하나를 선택
        int index = (int)(Math.random() * CARD_NUM);
        System.out.println(index);
        return pick(index);
    }

    void shuffle() { // 카드의 순서 섞음
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

// Card클래스
class Card {
    static final int KIND_MAX = 4;	// 카드 무늬의 수
    static final int NUM_MAX  = 13;	// 무늬별 카드 수

    static final int SPADE   = 4;
    static final int DIAMOND = 3;
    static final int HEART   = 2;
    static final int CLOVER  = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 2);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // toString()이 없으면 참조변수가 가르키는 인스턴스 정보로 출력 ex. chap07_OOP2.inheritance.Card@d041cf
    // 참조변수의 출력시 toString()을 명시하지 않아도 자동으로 호출됨
    // toString()은 모든 클래스의 조상인 Object 클래스에 정의된 것으로 어떤 객체에 대해서도 호출 가능함
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"}; // kind가 1부터 시작해서 0번째 인덱스 빈문자열
        String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    }
}
