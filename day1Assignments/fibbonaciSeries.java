package day1Assignments;

public class fibbonaciSeries {
	
	public static void main(String[] args) {
		int range=8, firstNum=0,secNum=1;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2;i<range;i++) {
			
			int sum = firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
		System.out.println(sum);	
		}
	}

}
