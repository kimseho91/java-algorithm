package study02;
import java.util.Scanner;
public class IntArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학","과학","사회"};
		System.out.printf("%s점수를 입력하세요.\n",subjects[0]);
		int kor = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요.\n",subjects[1]);
		int eng = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요.\n",subjects[2]);
		int math = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요.\n",subjects[3]);
		int science = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요.\n",subjects[4]);
		int society = scanner.nextInt();
		int [] scores = {kor, eng, math, science, society};
		System.out.printf("%s점수 %d \n",subjects[0],scores[0]);
		System.out.printf("%s점수 %d \n",subjects[1],scores[1]);
		System.out.printf("%s점수 %d \n",subjects[2],scores[2]);
		System.out.printf("%s점수 %d \n",subjects[3],scores[3]);
		System.out.printf("%s점수 %d \n",subjects[4],scores[4]);
		
	}

}