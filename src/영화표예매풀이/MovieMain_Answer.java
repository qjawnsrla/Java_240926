package 영화표예매풀이;
// 예매하기와 종료하기 메뉴작성
// 총 좌석은 10개
// 좌석 당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메소드 작성 ( [] [] [] [] [] [V] )
// 좌석 예약하기 : 값이 0이면 예약안된 좌석, 1이면 판매된 좌석
// 총 판매금액에 대한 메소드 작성

import java.util.Scanner;

public class MovieMain_Answer {
    public static void main(String[] args) {
        // MovieTicket 클래스에 대한 객체 생성
        MovieTicket_Answer movieTicketAnswer = new MovieTicket_Answer(12000);
        // 입력받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 메뉴 작성은 무한 반복문으로 구현
        while (true) {
            System.out.println();
            System.out.println("[1]에매하기");
            System.out.println("[2]취소하기");
            System.out.println("[3]종료하기");
            int select = sc.nextInt();

            // 1. 좌석 예약하기 메소드 호출
            // 2. 종료하기 누르면 총 판매 금액 표시하고 종료
            switch (select) {
                case 1:
                    movieTicketAnswer.selectSeat();
                    break;
                case 2:
                    movieTicketAnswer.cancelSeat();
                        break;
                case 3:
                    System.out.println(movieTicketAnswer.totalAmount());
                    return;
                    default:
                        System.out.println("메뉴 선택이 잘못 되었습니다.");
            }
        }
    }

}
