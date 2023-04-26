package day1Assignments;



public class armstrongNumber {
	public static void main(String[] args) {
		
	
	int input = 153;
	int originalNumber, remainder;
	int calculated=0;

	originalNumber = input; 
	while (originalNumber!=0) {
		
		remainder= originalNumber %10;
		calculated+=Math.pow(remainder, 3);
		originalNumber/=10;
		
	}
	if (calculated ==input) {
		System.out.println(input+ "is an armstrong number");
				
		
	}
	
	else
		System.out.println(input + "This is not an armstrong number");
	}

}

