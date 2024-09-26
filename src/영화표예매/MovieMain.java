package 영화표예매;
// 예매하기와 종료하기 메뉴작성
// 총 좌석은 10개
// 좌석 당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메소드 작성 ( [] [] [] [] [] [V] )
// 좌석 예약하기 : 값이 0이면 예약안된 좌석, 1이면 판매된 좌석
// 총 판매금액에 대한 메소드 작성

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket 클래스에 대한 객체 생성
        // 입력받기 위한 스캐너 생성
        // 메뉴 작성은 무한 반복문으로 구현하고
        // 1. 좌석 예약하기 메소드 호출
        // 2. 종료하기 누르면 총 판매 금액 표시하고 종료
        int n = 0;

        MovieTicket movieTicket = new MovieTicket();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("[1] 좌석 예약하기 [2] 종료하기 : ");
            n = sc.nextInt();
            if (n == 1){
                movieTicket.Movie();
            }else if (n == 2){
                movieTicket.setPrice();
                break;
            }
        }
        System.out.println("프로그램을 종료합니다.");


    }
}
