package 영화표예매풀이;

import java.util.Scanner;

public class MovieTicket_Answer {
    private final int[] seat = new int[10];
    private final int price;
    private final Scanner sc = new Scanner(System.in);

    public MovieTicket_Answer(int price) {
        this.price = price;
    }

    public void printSeat() {
        for (int e : seat) {
            if (e == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }

    public void printSeatt(){
        for (int i = 0; i < seat.length; i++) {
           if(seat[i] == 0){
               System.out.print("[ ]");
           } else {
               System.out.print("[V]");
           }
        }
    }

    public void selectSeat() {
        printSeat();
        System.out.println();
        System.out.print("좌석 번호를 입력 하세요 : ");
        int seatPos = sc.nextInt();
        if (seat[seatPos - 1] == 0) {
            seat[seatPos - 1] = 1;
            System.out.println("좌석이 예매 되었습니다.");
            printSeat();
        } else {
            System.out.println("이미 예약된 좌석 입니다.");
        }
        System.out.println();
    }

    public void cancelSeat(){
        printSeatt();
        System.out.println();
        System.out.print("취소할 좌석을 입력하세요 : ");
        int seatPos = sc.nextInt();
        if (seat[seatPos - 1] == 1){
            seat[seatPos - 1] = 0;
            System.out.println("좌석 예약이 취소되었습니다.");
            printSeatt();
        } else{
            System.out.println("예약된 좌석이 아닙니다.");
        }
        System.out.println();
    }

    public int totalAmount() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt++;
        }
        return cnt * price;
    }
}
