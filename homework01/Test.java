package homework01;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		int b = 0;
		System.out.println("시작값과 마지막값의 짝수합구하기");
		System.out.println("시작값");
		int s = sc.nextInt();
		System.out.println("마지막값");
		int e = sc.nextInt();
		for(int i = s; i <= e; i++) {
			if(i%2==0) {
				int e2 = e;
				if(e2 % 2 == 0) {
					e2 = e;
				}else {
					e2 = e-1;
				}
				if(i != e2) {	
				a += i + "+";	
			}else {
				a += i + "=";
			}
			b += i;
			}	
		}
			
		System.out.print(a+b);
		
	}
	
}
