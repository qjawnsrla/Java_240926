package 회원정보;
// 이름은 String
// 나이는 int, 0 ~ 199 까지만 정상으로 간주, 이외의 값이 입력되면 재입력 요구
// 만약, 숫자가 아닌 다른 값이 오는 경우에 대한 처리는 일단 무시 (개별 진행해도 됨)
// 성별은 문자 타입으로 입력, 남성은 'M' 과 'm' , 여성은 'F' 와 'f'
// 성별에 대한 출력은 "남성", "여성" 으로 출력
// 직업은 정수로 입력 ( 1 ~ 4 ) 입력하고 출력은 1은 "학생", 2는 "회사원", 3은 "주부", 4는 "무직"
// 1 ~ 4 이외의 값은 재입력 요구

// 모든 입력이 완료되면 결과는 한번에 출력


public class MemberInfoEx {
    public static void main(String[] args) {
        // Member 클래스에 대한 객체를 생성하기 위해 기본 생성자 호출
        Member member = new Member();
        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.getInfo();


        // 회원의 이름 확인
        member.getName();
        System.out.println("회원의 이름 : " + member.getName());
    }
}
