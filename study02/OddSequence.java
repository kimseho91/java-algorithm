package study02;

public class OddSequence {

	public static void main(String[] args) {
		// 1 + 3 + 5 + 7 + 9 =
		// i % 2 = 0 이면 짝수 i % 2 = 1 홀수
		String sequence = "";
		int series = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
			if(i != 9) {
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