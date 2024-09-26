package 회원정보;
// 이름은 String
// 나이는 int, 0 ~ 199 까지만 정상으로 간주, 이외의 값이 입력되면 재입력 요구
// 만약, 숫자가 아닌 다른 값이 오는 경우에 대한 처리는 일단 무시 (개별 진행해도 됨)
// 성별은 문자 타입으로 입력, 남성은 'M' 과 'm' , 여성은 'F' 와 'f'
// 성별에 대한 출력은 "남성", "여성" 으로 출력
// 직업은 정수로 입력 ( 1 ~ 4 ) 입력하고 출력은 1은 "학생", 2는 "회사원", 3은 "주부", 4는 "무직"
// 1 ~ 4 이외의 값은 재입력 요구

// 모든 입력이 완료되면 결과는 한번에 출력

import java.util.Scanner;

public class Member{

        // 필드 추가 (필드는 클래스 내에 존재하는 변수를 지칭, 인스턴스 필드, 정적 필드, 지역변수
        private String name;    // private 은 접근제한자, 같은 클래스 내에서만 접근가능
        private int age;
        private char gender;
        private int job;
        private final Scanner sc = new Scanner(System.in);
        // 자바에서 생성자를 만들지 않으면 기본 생성자가 자동으로 만들어짐
        public void setName() {
                System.out.print("이름을 입력 : ");
                name = sc.nextLine();
        }
        public Object getName(){
                return name;

        }

        public void setAge(){
                while (true){
                        System.out.print("나이를 입력 : ");
                        age = sc.nextInt();
                        if (age >= 0 && age < 200) return;
                        System.out.println("나이를 잘못 입력하셨습니다.");
                }
        }

        public void setGender(){
                while(true){
                        System.out.print("성별을 입력 : ");
                        gender = sc.next().charAt(0);   // 문자에 대한 입력은 문자열에서 해당 문자를 인덱스의 문자를 추출
                        switch (gender){
                                case 'M': case 'm': case 'F': case 'f': return;
                                default:
                                        System.out.println("성별을 잘못 입력하셨습니다.");
                        }
                }
        }

        public  int getGenderType() {    // 반환타입이 존재한다 (int)
                if (gender == 'M' || gender == 'm') return 1;
                else return 2;
        }

        public void setJob(){
                while(true){
                        System.out.print("직업을 입력 : ");
                        job = sc.nextInt();
                        if (job >= 0 && job < 5) return;
                        System.out.println("직업을 잘못 입력하셨습니다.");
                }
        }

        public void getInfo(){
                String[] genderStr = {"", "남성", "여성"};  // 입력된 값과 배열의 인덱스를 일치하기 위해서 첫번째를 비워둠
                String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
                System.out.println("====== 회원정보 ======");
                System.out.println("이름 : " + name);
                System.out.println("나이 : " + age);
                System.out.println("성별 : " + genderStr[getGenderType()]);
                System.out.println("직업 : " + jobStr[job]);
        }

}
