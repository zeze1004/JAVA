package chap07_OOP2.inheritance;

class DrawShape {
    public static void main(String[] args) {
        Point[] p = {
                new Point(100, 100),
                new Point(140,  50),
                new Point(200, 100)
        };

        Triangle t = new Triangle(p);
        Circle   c = new Circle(new Point(150, 150), 50); // 아래 구문들을 합친 문장
        /*
         Point p = new Point(150, 150);
         Circle c = new Circle(p, 50);
        */

        t.draw(); // Triangle 클래스의 draw() 호출, 삼각형 출력
        c.draw(); // Circle 클래스의 draw(), 원 출력
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() { // 원점
        this(0,0);
    }

    String getXY() {
        return "("+x+","+y+")"; // x와 y의 값을 문자열로 반환
    }
}

class Circle extends Shape {
    Point center;	// Point 클래스의 참조변수, 원의 원점좌표를 표현
    int r;			// 반지름

    Circle() {
        this(new Point(0, 0), 100); // Circle(Point center, int r)를 호출
        /*
        * Point p = new Point(0, 0);
          Circle c = new Circle(p, 100); // 두 문장을 하나로 합침
        * */
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        // DrawShape에서 선언한 인스턴스 변수(p: 인스턴스 배열을 가리키는 참조변수) 호출
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
