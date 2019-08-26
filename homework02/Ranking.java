package homework02;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 double[] records = new double[3]; // 기록
		 int[] rank = new int[3]; // 순위
		 String[] player = new String[] {"A","B","C"}; // 선수
		 for(int i = 0; i < 3 ; i++) { //순위 배열을 모두 1등으로 초기화 시켜줍니다.
			 rank[i] = 1;
			 }
		 for(int i = 0; i <3 ; i++) { // 순위 배열에 선수의 기록를 3번 입력받습니다.
			 System.out.printf("%s선수 기록을 입력해주세요.\n",player[i]);
			 records[i] = scanner.nextDouble();
			 System.out.printf("%s선수 기록 : %.1f\n",player[i],records[i]);
		 }
		 for(int i = 0; i < 3 ; i++) { // 선수들 끼리의 기록를 비교해서 자신의 기록보다 크면 해당순위를 1씩 증가시켜 순위를 결정.
			 for(int j = 0 ; j < 3 ; j++) {
				 if(records[i] > records[j])
					 rank[i] = rank[i]+1;
			 }
		 }
		 for(int i = 0 ; i < 3 ; i++) { // 순위 출력문입니다.
			 
			 System.out.printf("%d등 : %s 선수기록 (%.1f초)\n",rank[i],player[i],records[i]);
		 }
	}
}