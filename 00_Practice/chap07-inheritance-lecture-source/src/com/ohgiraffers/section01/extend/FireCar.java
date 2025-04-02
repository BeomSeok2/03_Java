package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar() {

        /***
         * 모든 생성자에는 첫 줄에 super()를 컴파일러가 자동 추가한다.
         * 부모의 기본 생성자를 호출하는 구문임
         * 명시적, 묵시적 전부 사용 가능하다.
         */
        super(); // 자식클래스에서는 이게 기본적으로 생략되어 보여짐
        System.out.println("FireCare 클래스의 기본 생성자 호출됨");


    }

    /*
    🔹 @Override (오버라이드)란?
        @Override는 **메서드 재정의(Overriding)**를 의미하는 **어노테이션(annotation)**입니다.
        자식 클래스에서 부모 클래스의 메서드를 같은 이름과 매개변수로 다시 구현할 때 사용합니다.
        🔹 오버라이딩(Overriding)의 특징
        ✅ 메서드 이름, 반환 타입, 매개변수가 부모 클래스의 메서드와 동일해야 함
        ✅ 접근 제어자는 부모 클래스의 메서드보다 더 강한 수준(public > protected > default > private)으로만 변경 가능
        ✅ @Override 어노테이션을 사용하면 컴파일러가 제대로 오버라이딩되었는지 검증해 줌 (오타 방지 효과)
     */

    @Override // @ << 어노테이션 (이런 기능을 하세요~ 뭐 이런거임)
    public void soundHorn() {

        if (isRunnig()) {
            System.out.println("빠아아아앙~~~~!!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다!!! 비키세요!!!");
        }

    }

    public void sprayWater () {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ");
    }
}
