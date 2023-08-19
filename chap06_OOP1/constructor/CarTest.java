package chap06_OOP1.constructor;

class Car1 {
    // 인스턴스 변수 3개
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car1() {}                            // 매개변수가 없는 생성자
    Car1(String c, String g, int d) {    // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car1 c1 = new Car1();                                 // 매개변수가 없는 생성자는 인스턴스를 생성한 다음에 인스턴스 변수들을 개별적으로 초기화해야함
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car1 c2 = new Car1("white", "auto", 4);       // 인스턴스 생성하는 동시에 원하는 값으로 초기화 가능

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}