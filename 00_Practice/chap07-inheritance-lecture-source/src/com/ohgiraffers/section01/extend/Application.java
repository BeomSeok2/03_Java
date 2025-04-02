package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {

        // ------ 부모 클래스(Car) 객체 생성 및 사용 ------
        System.out.println("------ Car ------");
        Car car = new Car();  // Car 객체 생성

        car.soundHorn();  // 경적을 울림 (기본 자동차 경적 소리)
        car.run();        // 자동차 이동
        car.soundHorn();  // 다시 경적 울림
        car.stop();       // 자동차 정지
        car.soundHorn();  // 정지 후 경적 울림

        /*
        ✅ 상속(extends)의 개념 정리 ✅
        - 상속을 이용하면 **코드 재사용이 가능**하지만,
          **잘못 사용하면 유지보수성이 낮아질 위험이 있음**.
        - 따라서 **IS-A 관계**(즉, "A는 B이다"가 성립하는 경우)에만 상속을 사용해야 한다.

        ✔ IS-A 관계 예시:
          - "삼각형은 도형이다" (✅ True) → 삼각형은 도형을 상속 가능
          - "도형은 삼각형이다" (❌ False) → 도형이 삼각형을 상속하는 것은 적절하지 않음
          - "소방차(FireCar)는 자동차(Car)이다" (✅ True) → 상속 관계 적절
          - "자동차(Car)는 소방차(FireCar)이다" (❌ False) → 잘못된 상속 구조
        */

        // ------ 자식 클래스(FireCar) 객체 생성 및 사용 ------
        System.out.println("------ Fire Car ------");
        FireCar fireCar = new FireCar();  // FireCar 객체 생성

        fireCar.soundHorn();  // 🚒 소방차 전용 경적 소리 (오버라이딩된 메서드)
        fireCar.run();        // 자동차 이동 (부모 클래스에서 상속받은 기능)
        fireCar.soundHorn();  // 🚒 다시 소방차 경적 울림
        fireCar.sprayWater(); // 🚒 소방차만의 기능 (물을 뿌리는 기능)
        fireCar.stop();       // 자동차 정지 (부모 클래스에서 상속받은 기능)


        System.out.println("------ Racing Car ------");
        racingCar raceCar = new racingCar();
        raceCar.run();
        raceCar.stop();
        raceCar.stop();
    }


}
