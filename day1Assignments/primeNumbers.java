package day1Assignments;

//Prime numbers -Prasanna

public class primeNumbers {
	public static void main(String[] args) {
		int a = 13;
		boolean flag = false;
		for ( int i =2; i<a/2;i++) {
			
			if(a%2==0) {
				flag = true;
				break;
			}
			
		}
	
		if(!flag) {
			System.out.println(a+ "is a prime number");
		}
		else {
			System.out.println(a+ "is not a prime number");
		}
	}

}
