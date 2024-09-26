package 필드와메소드;
// 필드 : 변수의 속성을 표현하는 필드
// 메소드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
// 자바는 클래스 기빈의 언어이므로 클래스 외부에 별도의 함수가 존재할 수 없음

import jdk.dynalink.beans.StaticClass;

public class FieldAndMethodEx {
    public static void main(String[] args) {
//        FieldAndMethodEx test = new FieldAndMethodEx();
//        int sum = test.sum(100,200);
//        int sum = sum(100,200);
//        System.out.println(sum(100,200));
//        System.out.println(sum("Test","Java"));
//        System.out.println(sum("Test",1234));
//        System.out.println(sum(1,2,3,4,5,6,7,8,9));
        String factory = "현대자동차 울산공장";
        Car gv70 = new Car("GV70", 220, 280, "Black");
        Car ionic5N = new Car("아이오닉5N", 250, 600, "White");
        Car x6 = new Car("X6", 250, 350, "Gray");
        Car santafe = new Car();
        Car sorento = new Car("쏘렌토");
        gv70.getCarInfo();
        ionic5N.getCarInfo();
        x6.getCarInfo();
        santafe.getCarInfo();
        sorento.getCarInfo();
        System.out.println("=================");
        System.out.println(Car.productNumber);
        System.out.println(Car.company);
    }

    // 클래스 메소드, 매개변수의 입력이 존재, 반환값도 존재
    static int sum(int a, int b) {
        return a + b;
    }

    // 메소드 오버로딩 - 위의 sum과 데이터타입이 다르기때문에 이처럼 선언가능
    static String sum(String a, String b) {
        return a + b;
    }

    // 메소드 오버로딩 - 위의 sum과 데이터타입이 다르기때문에 이처럼 선언가능
    static String sum(String a, int b) {
        return a + b;
    }

    // 매개변수의 개수를 모를때 (알수 없을 때) 사용하는 방법
    static int sum(int... val) {     // 전개연산자
        int sum = 0;
        for (int e : val) {
            sum += e;
        }
        return sum;
    }
    /*
    // 인스턴스 메소드
    int sum(int a, int b){
        return a + b;
    }*/
}
class Car{
    static int productNumber = 0;   // 클래스 필드, 프로그램 생성 시 즉, 클래스가 만들어질 때 메모리 생성
    static String company = "현대자동차";    // 클래스 필드
    String modelName;   // 인스턴스 필드, 객체가 생성될 때 만들어진다
    int speed;          // 인스턴스 필드,
    int horsePower;     // 인스턴스 필드
    String color;       // 인스턴스 필드

    // 매개변수가 있는 생성자, 클래스를 객체로 만들 때 호출
    Car (String name, int speed, int power, String color){
        modelName = name;
        // this 는 자기 객체를 참조하는 변수
        this.speed = speed; // 컴퍼일러는 speed를 매개변수의 speed로 보기 때문에 speed 값을 인스턴스 필드에 대입하려면 this 사용해야한다.
        this.horsePower = power;
        this.color = color;
        productNumber += 1;     // 클래스 필드
    }
    Car(){
        modelName = "싼타페";
        speed = 99;
        horsePower = 99;
        color = "black";

        productNumber += 1;
    }
    Car (String name){
        this.modelName = name;
        speed = 100;
        horsePower = 100;
        color = "black";

        productNumber += 1;
    }
    void getCarInfo(){
        System.out.println("=================");
        System.out.println("이름 : " + this.modelName);
        System.out.println("속도 : " + this.speed);
        System.out.println("마력 : " + this.horsePower);
        System.out.println("색상 : " + this.color);
    }
}

