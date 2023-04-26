package day1Assignments;

//Find if a number is a  palindrome or not

public class palindromeNumbers {
	
	
	public static void main(String [] args) {
	int temp, sum, remainder;
	sum=0;
	int number=34343;//number to check
	temp=number;
	while(number>0) {
		
		remainder=number%10;
		sum=(sum*10)+remainder;
		number/=10;
		
	}
	if(temp==sum) {
		System.out.println("this is a palindrome");
	}
	
	else
		System.out.println("This is not a palindrome");
}
}
