package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String Result = "";
//        int a = 1;
        while(true) {
        	System.out.println("가위 바위 보 게임 시작 !!");
        	System.out.println("종료를 원하면 종료를 입력하세요.");
        	int ran = random.nextInt(3)+1;
        	String user = sc.next();
//        	a++;
        	switch(ran + user) {
        	case 1 + "가위" : Result = "컴퓨터는 가위 " + "당신은 " + user + " 당신은 비겼습니다."; break;
        	case 1 + "바위" : Result = "컴퓨터는 가위 " + "당신은 " + user + " 당신은 이겼습니다."; break;
        	case 1 + "보" : Result = "컴퓨터는 가위 " + "당신은 " + user + " 당신은 졌습니다."; break;
        	case 2 + "가위" : Result = "컴퓨터는 바위 " + "당신은 " + user + " 당신은 졌습니다."; break;
        	case 2 + "바위" : Result = "컴퓨터는 바위 " + "당신은 " + user + " 당신은 비겼습니다."; break;
        	case 2 + "보" : Result = "컴퓨터는 바위 " + "당신은 " + user + " 당신은 이겼습니다."; break;
        	case 3 + "가위" : Result = "컴퓨터는 보 " + "당신은 " + user + " 당신은 이겼습니다."; break;
        	case 3 + "바위" : Result = "컴퓨터는 보 " + "당신은 " + user + " 당신은 졌습니다."; break;
        	case 3 + "보" : Result = "컴퓨터는 보 " + "당신은 " + user + " 당신은 비겼습니다."; break;
        	case 1 + "종료" : System.out.println("종료합니다.");return;
        	case 2 + "종료" : System.out.println("종료합니다.");return;
        	case 3 + "종료" : System.out.println("종료합니다.");return;
        	}
        	System.out.println(Result);
        	
        }
	}
	
}