package study05;

public class Service {
	
	public String getBmi(Member member) {
		String result = "";
		String eval = "";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight / ((height*0.01)*(height*0.01));
		if(bmi > 30.0) {
			eval = "고도비만";
		}else if(bmi > 25.0) {
			eval = "비만";
		}else if(bmi > 23.0) {
			eval = "과체중";
		}else if(bmi > 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}
		return result = String.format("당신의 BMI 수치는 %.2f으로 %s 입니다.",bmi,eval);
	}
	
	public String getReportCard(Member member) {
		String result = "";
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		String name = member.getName();
		String[] subjects = { "국어", "영어", "수학" };
		int sum = kor+eng+math;
		int average = (kor + eng + math) / 3;
		if (average >= 90) {
			result = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 장학생 입니다.",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		} else if (average >= 70 && average < 90) {
			result = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 합격 입니다.",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		} else {
			result = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 불합격 입니다.",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		}
		return result;
	}
	
	public String getTax(Member member) {
		String result = "";
		String name = member.getName();
		double tax = member.getTax();
		double salary = member.getSalary();
		double tax1 = salary*tax*0.01;
//		double tax2 = Math.round((tax1*100)/100.0);
		return result = String.format("연봉 %.0f만원을 받으시는 %s님께서 납부할 세금은 %.2f만원입니다.",salary,name,tax1);
	}
	
}
