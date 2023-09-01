package chap11_ColletionsFramework;

import java.util.*;

class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId1", "1234");
        map.put("myId2", "1111");
        map.put("myId2", "1004");   // myId2 키가 이미 있으므로 새로 들어온 값인 1004로 변경됨

        Scanner s = new Scanner(System.in);	// 라인 단위로 입력 받음

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = s.nextLine().trim();

            System.out.print("password: ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            } else {
                if(!(map.get(id)).equals(password)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
        }
    }
}
