package study02;

public class EvenSequence {

	public static void main(String[] args) {
		// 2 + 4 + 6 + 8 + 10 =
		// i % 2 = 0 이면 짝수 i % 2 = 1 홀수
		String sequence = "";
		int series = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 1) {
			if(i != 10) {
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