package homework04_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		String total = "";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int sum = kor+eng+math;
		return total = String.format("점수의 총 합은 :%s점 입니다.", sum);
	}
	public String getAvg(Grade grade) {
		String avg = "";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int sum = kor+eng+math;
		return avg= String.format("점수의 평균은 :%s점 입니다.", sum/3);
	}
}
