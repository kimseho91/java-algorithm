package homework01;
import java.util.Scanner;
public class GenderChecker2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Result = "";
		int a = 1;
		while(a<=1) {
			System.out.println("성별 및 국적을 확인합니다.");
			String user = sc.next();
			int check = Integer.parseInt(user.substring(7,8));
			a++;
			switch(check) {
			case 9 : Result = "1800 ~ 1899년에 태어난 남성입니다."; break;
			case 0 : Result = "1800 ~ 1899년에 태어난 여성입니다."; break;
			case 1 : Result = "1900 ~ 1999년에 태어난 남성입니다."; break;
			case 2 : Result = "1900 ~ 1999년에 태어난 여성입니다."; break;
			case 3 : Result = "2000 ~ 2099년에 태어난 남성입니다."; break;
			case 4 : Result = "2000 ~ 2099년에 태어난 여성입니다."; break;
			case 5 : Result = "1900 ~ 1999년에 태어난 외국인 남성입니다."; break;
			case 6 : Result = "1900 ~ 1999년에 태어난 외국인 여성입니다."; break;
			case 7 : Result = "2000 ~ 2099년에 태어난 외국인 남성입니다."; break;
			case 8 : Result = "2000 ~ 2099년에 태어난 외국인 여성입니다."; break;
			default : System.out.println("종료합니다"); return;
			}
			System.out.println(Result);
		}
	}

}
