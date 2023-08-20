package chap07_OOP2.inheritance;

class PointTest {
    public static void main(String args[]) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

// 2차원 좌표계
class Point2 {
    int x;
    int y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :"+ y;
    }
}

// Point를 상속받음
class Point3D extends Point2 {
    int z;

    Point3D(int x, int y, int z) { // 생성자는 반환이 없어서 void 생략
        super(x, y);
        this.z = z;
    }

    // Point 클래스의 메소드에서 반환값을 수정함
    String getLocation() {    // 오버라이딩
        // return "x :" + x + ", y :"+ y + ", z :" + z;
        return super.getLocation() + ", z :" + z;
    }
}