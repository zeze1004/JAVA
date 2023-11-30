package basic.class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 90;

        // Student[] students = new Student[2]; // students = 메모리 주소값, 해당 메모리에 두 개의 배열 공간 존재[null, null]
        //                                      // 자바에서 대입은 항상 변수에 들어 있는 값을 복사
        // students[0] = student1;
        // students[1] = student2;

        // 생성과 선언을 동시에 하는 경우
        Student[] students = { student1, student2 };

        // Student s를 선언하여 배열의 참조값을 전달
        for (Student s : students) { // Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
