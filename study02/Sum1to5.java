package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		String eval = "";
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if(i == 10) {
				eval += i+ " = ";
				}else if(i != 10) {
				eval += i+ " + " ;
				}
		}
		System.out.print(eval+sum);
	}

}

/**if(i == 5) {
result += i+ " = ";
}else if(i != 5) {
result += i+ " + " ;
}
*/


/*for(int i = 1; i <=5; i++) {
	System.out.print(i);
	switch(i) {
	case 5 : System.out.print("="); break;
	default : System.out.print("+"); break;
	}
}
*/