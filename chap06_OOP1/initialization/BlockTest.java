package chap06_OOP1.initialization;

class BlockTest {
    static {
        System.out.println("클래스 초기화 블럭"); // 클래스 초기화 블럭(static)
    }                                        // 클래스가 메모리에 처음 로딩될 때 한 번만 수행

    {
        System.out.println("인스턴스 블럭");    // 인스턴스 초기화 블럭, 인스턴스 생성될 때 마다 수행됨
    }                                       // 클래스의 모든 생성자에서 공통으로 수행하는 문장이 있을 때,
                                            // 각 생성자별로 쓰면 중복됨으로 인스턴스 블록에 넣으면 코드가 간결해짐
    public BlockTest() {
        System.out.println("생성자");         // 생성자 수행
    }

    public static void main(String args[]) {
        System.out.println("BlockTest bt = new BlockTest(); 구문 실행시 인스턴스 초기화 블럭과 생성자 실행됨");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); 구문 실행시 인스턴스 초기화 블럭과 생성자 실행됨");
        BlockTest bt2 = new BlockTest();
    }
}
