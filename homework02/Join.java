package homework02;
import java.util.Scanner;
public class Join {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = "", pw = "", name = "", dob = "", blood = "", eval = "";
		double height = 0, weight = 0;
		boolean isAdult = true;
		
		System.out.println("===== 회원가입 =====");
		System.out.println("아이디를 입력하세요.");
		id = scanner.next();
		System.out.println("비밀번호를 입력하세요.");
		pw = scanner.next();
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("생년월일을 입력하세요.");
		dob = scanner.next();
		System.out.println("혈액형을 입력하세요.");
		blood = scanner.next();
		System.out.println("소수점 첫번째 자리까지 키를 입력해주세요.");
		height = scanner.nextDouble();
		System.out.println("소수점 첫번째 자리까지 몸무게를 입력해주세요.");
		weight = scanner.nextDouble();
		System.out.println("성인 여부를 입력해주세요.true 또는 false");
		isAdult = scanner.nextBoolean();
		if(isAdult == true) {
			eval = "성인입니다.";
		}else {
			eval = "미성년자 입니다.";
		}
		System.out.println("===== 회원정보 =====");
		System.out.printf("아이디:%s \n비밀번호:%s \n이름:%s \n생년원일:%s \n성인여부:%s \n키:%.1fcm \n 몸무게:%.1fkg \n 혈액형:%s형",id,pw,name,dob,eval,height,weight,blood);
	}

}
