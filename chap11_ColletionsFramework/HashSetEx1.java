package chap11_ColletionsFramework;
import java.util.*;

class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1",1,"2","2","3","3","4","4","4"}; // 하나는 1이고 하나는 "1"
        Set set = new HashSet();

        for(int i=0; i < objArr.length; i++) {
            set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set); // [1, 1, 2, 3, 4] int 1과 문자 1은 타입이 달라서 중복으로 인정되지 않음
    }
}
