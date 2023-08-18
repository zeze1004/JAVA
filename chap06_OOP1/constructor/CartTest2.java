package chap06_OOP1.constructor;

class Car {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car() {                                             // 매개변수가 없을시, 차 디폴트 속성
        this("white", "auto", 4);
    }

    Car(String color) {                                 // 색만 변경 가능
        this(color, "auto", 4);
    }
    Car(String color, String gearType, int door) {      // 풀 옵션(커스터마이징 가능)
        this.color    = color;
        this.gearType = gearType;
        this.door     = door;
    }
}

class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}