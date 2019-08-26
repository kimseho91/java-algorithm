package study02;

import java.util.Scanner;

public class EvenSequenceScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sequence = "";
		int series = 0;
		System.out.println("====================");
		System.out.println("입력된 시작 값 으로부터 마지막 값 까지 짝수의 합");
		System.out.println("====================");
		System.out.println("시작 값을 입력하세요.");
		int start = sc.nextInt();
		System.out.println("마지막 값을 입력하세요.");
		int end = sc.nextInt();
		for(int i = start; i <= end; i++) {
			if(i % 2 == 0) {
				int end2 = end;
				if(end % 2 ==0) {
					end2 = end;
				} else {
					end2 = end-1;
				}
			if(i != end2) {
				sequence += i + " + ";
			}else{
				sequence += i + " = ";
			}
			series += i;
		}	
	}
		System.out.print(sequence+series);
}
	
}