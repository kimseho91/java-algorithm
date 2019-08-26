package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		
		String eval = "";
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
			eval += (i == 10) ? i + " = " : i + " + ";
		}
		System.out.print(eval+sum);
	}	
		
}		

/*for(int i = 1; i <=5; i++) {
	System.out.print(i);
	switch(i) {
	case 5 : System.out.print("="); break;
	default : System.out.print("+"); break;
	}
}
*/