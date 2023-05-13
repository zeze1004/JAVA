package chap07_OOP2.polymorphism;

import java.util.*;			    // Vector클래스

class Product {
    int price;			        // 제품 가격
    int bonusPoint;		        // 제품 구매시 제공 하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer {			            // 고객
    int money = 1000;  	            // 보유 금액
    int bonusPoint = 0;	            // 보너스점수
    Vector item = new Vector();	    // 구입한 제품 저장

    void buy(Product p) {           // buy(살 제품)
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }
        money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺌
        bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가
        item.add(p);				// Vector에 구입한 제품 저장
        System.out.println(p + "을(를) 구입하셨습니다.");
    }

    void refund(Product p) {	    // 구입한 제품을 환불
        if(item.remove(p)) {	    // Vector에서 제품 제거
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을(를) 반품하셨습니다.");
        } else {			        // 제거에 실패한 경우
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {		        // 구매한 물품의 정보 요약 출력
        int sum = 0;		        // 구입한 물품의 가격 합계
        String itemList =""; 	    // 구입한 물품 목록

        if(item.isEmpty()) {	  // Vector가 비어있는지 확인
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        // 구입한 물품의 총 가격과 목록(itemList)
        for(int i=0; i<item.size(); i++) {
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class PolyArgumentTest3 {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);              // Product p = new Tv(), 조상타입의 참조변수로 자손타입의 객체를 참조하는 것이 가능
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
