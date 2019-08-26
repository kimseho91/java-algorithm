package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();
		System.out.println("가위 바위 보 게임 시작 !!");
        int ran = random.nextInt(3)+1;
        System.out.println("무엇을 낼건가요 ??");
        String a = sc.next();
        String user = a;
        String anwer = "";
        switch(ran + user) {
        case 1 + "가위" : anwer = "컴퓨터는 가위 " + "당신은 " + a + " 당신은 비겼습니다." ; break;
        case 1 + "바위" : anwer = "컴퓨터는 가위 " + "당신은 " + a + " 당신은 이겼습니다." ; break;
        case 1 + "보" : anwer = "컴퓨터는 가위 " + "당신은 " + a + " 당신은 졌습니다." ; break;
        case 2 + "가위" : anwer = "컴퓨터는 바위 " + "당신은 " + a + " 당신은 졌습니다." ; break;
        case 2 + "바위" : anwer = "컴퓨터는 바위 " + "당신은 " + a + " 당신은 비겼습니다." ; break;
        case 2 + "보" : anwer = "컴퓨터는 바위 " + "당신은 " + a + " 당신은 이겼습니다." ; break;
        case 3 + "가위" : anwer = "컴퓨터는 보 " + "당신은 " + a + " 당신은 이겼습니다." ; break;
        case 3 + "바위" : anwer = "컴퓨터는 보 " + "당신은 " + a + " 당신은 졌습니다." ; break;
        case 3 + "보" : anwer = "컴퓨터는 보 " + "당신은 " + a + " 당신은 비겼습니다." ; break;
        }
        System.out.println(anwer);
	}

}