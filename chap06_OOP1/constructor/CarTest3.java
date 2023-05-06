package chap06_OOP1.constructor;

class Car {
    String color;		// 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) {	    // 인스턴스의 복사를 위한 생성자
        color    = c.color;
        gearType = c.gearType;
        door     = c.door;
    }

    Car(String color, String gearType, int door) {
        this.color    = color;
        this.gearType = gearType;
        this.door     = door;
    }
}
class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);	// c1의 복사본 c2를 생성, c1과 c2의 인스턴스 변수값이 동일함
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

        c1.door=100;	        // c1의 인스턴스변수 door의 값 변경
                                // 인스턴스간 메모리를 독립적으로 쓰므로 c2.door의 값은 바뀌지 않음(4)

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}