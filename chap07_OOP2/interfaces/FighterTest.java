package chap07_OOP2.interfaces;

class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)	{       // 참조변수 instanceof 클래스, 참조변수가 참고하는 인스턴스 타입이 특정 클래스가 맞는지 확인
            System.out.println("f는 Unit클래스의 자손입니다.");
        }
        if (f instanceof Fightable) {
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        }
        if (f instanceof Movable) {
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        }
        if (f instanceof Attackable) {
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        }
        if (f instanceof Object) {
            System.out.println("f는 Object클래스의 자손입니다.");
        }
    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) { /* 내용 생략 */ }      // 상속받은 인터페이스를 구현(implements)하는 메소드
    public void attack(Unit u) { /* 내용 생략 */ }
}

class Unit {
    int currentHP;	// 유닛의 체력
    int x;			// 유닛의 위치(x좌표)
    int y;			// 유닛의 위치(y좌표)
}

interface Fightable extends Movable, Attackable { }     // 인터페이스 Fightable 자체는 정의된 멤버가 하나도 없지만,
                                                        // 조상 인터페이스(Movable, Attackable)에 정의된 멤버를 모두 상속받음
interface Movable {	void move(int x, int y); }
interface Attackable { void attack(Unit u); }