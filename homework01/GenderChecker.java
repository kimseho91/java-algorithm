package homework01;
import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별 및 국적을 확인합니다.");
		String ssn = "";
		ssn = sc.next();
		String eval = "";
		int check = Integer.parseInt(ssn.substring(7,8));
		switch(check) {
		case 9 : eval = "1800 ~ 1899년에 태어난 남성입니다."; break;
		case 0 : eval = "1800 ~ 1899년에 태어난 여성입니다."; break;
		case 1 : eval = "1900 ~ 1999년에 태어난 남성입니다."; break;
		case 2 : eval = "1900 ~ 1999년에 태어난 여성입니다."; break;
		case 3 : eval = "2000 ~ 2099년에 태어난 남성입니다."; break;
		case 4 : eval = "2000 ~ 2099년에 태어난 여성입니다."; break;
		case 5 : eval = "1900 ~ 1999년에 태어난 외국인 남성입니다."; break;
		case 6 : eval = "1900 ~ 1999년에 태어난 외국인 여성입니다."; break;
		case 7 : eval = "2000 ~ 2099년에 태어난 외국인 남성입니다."; break;
		case 8 : eval = "2000 ~ 2099년에 태어난 외국인 여성입니다."; break;
		default : eval = "잘못입력했습니다." ; break;
		}
		System.out.println(eval);
	}

}