package day1Assignments;

public class secondSmallestInArray {
	public static void main(String[] args) {
		int arr[]= {23,45,67,32,89,22};
		int flag;
		for (int i =0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[i]>arr[j]) {
					
					flag = arr[i];
					arr[i]=arr[j];
					arr[j]=flag;
				}
			}
			
			
		}
		
		System.out.println("the second smallest element is"+arr[1]);
	}

}
