package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성 (힙 영역)
    int[] seat = new int[10];
    int num = 0;
    // 좌석 당 가격에 대한 인스턴스 필드
    int price;
    // 생성자는 좌석당 가격정보를 객체생성 시 넣어야되므로 매개변수가 있는 생성자 필요
    public MovieTicket() {
        for (int i = 0; i < seat.length; i++) {
            seat[i] = 0;
        }
    }
    public void Movie() {
        printSeat();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("예약할 좌석 번호를 입력하세요 ( 1 ~ 10 ) : ");
        num = sc.nextInt();
        setSeat(num);
    }
    // 좌석 상태 표시 메소드 구현
    public void printSeat(){
        for(int i=0;i<seat.length;i++){
            if(seat[i]==1){
                System.out.print("[V]");
            } else {
                System.out.print("[ ]");
            }
        }
    }

    // 좌석 예약 메소드 구현
    public void setSeat(int num) {
        if(num >=2 && num<=10){
            seat[num-1] = 1;
        } else if(num == 1){
            seat[0] = 1;
        } else{
            System.out.println("잘못된 값을 입력하였습니다. 0 ~ 10 사이의 값을 입력하세요.");
        }
        printSeat();
        System.out.println();
    }

    // 총 판매 금액 메소드 구현 (총 판매 금액은 인스턴스 필드로 만들지 말고 결과로 반환)
    public void setPrice(){
        int cnt = 0;
        for(int i=0;i<seat.length;i++){
            if(seat[i] == 1){
                cnt += 1;
            }
        }
        this.price = cnt * 10000;
        System.out.println("영화 티켓의 총판매 가격은 " + price + " 원 입니다.");
    }
}
