package homework02;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("계산기를 시작합니다.\n1.더하기, 2.빼기, 3.곱하기, 4.나누기, 5.종료 \n원하는걸 숫자로 입력해주세요.");
		int choice = scanner.nextInt();
		String eval = "";
		switch(choice) {
		case 5 : return;
		}
		System.out.println("계산할 값의 처음 수를 입력하세요.");
		String input = scanner.next();
		System.out.println("계산할 값의 두번째 수를 입력하세요.");
		String input2 = scanner.next();
		int sum = Integer.parseInt(input)+Integer.parseInt(input2);
		int sum2 =Integer.parseInt(input)-Integer.parseInt(input2);
		int sum3 =Integer.parseInt(input)*Integer.parseInt(input2);
		int sum4 =Integer.parseInt(input)/Integer.parseInt(input2);
		
		switch(choice) {
		case 1 : eval = input+"+"+input2+"="+sum; break;
		case 2 : eval = input+"-"+input2+"="+sum2;break;
		case 3 : eval = input+"X"+input2+"="+sum3;break;
		case 4 : eval = input+"/"+input2+"="+sum4;break;
		}
		System.out.println(eval);
		}
	}
}


/*To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
*/