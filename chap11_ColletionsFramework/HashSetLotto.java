package chap11_ColletionsFramework;

import java.util.*;

class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }

        List list = new LinkedList(set);	// LinkedList(Collection c) collections의 sort를 사용할려고 참조변수 set을 넣어 set의 값들을 바라보게 함
                                            // Collection은 인터페이스고 Collections는 클래스
        Collections.sort(list);				// Collections.sort(List list)
        System.out.println(list);           // 랜덤한 6개 순서들이 순서대로 출력 ex. [11, 23, 26, 28, 39, 42]
    }
}
