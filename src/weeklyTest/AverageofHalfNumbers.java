package weeklyTest;

import java.util.Scanner;

public class AverageofHalfNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the how number are there");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the number with space origniated");
		for(int i=0;i<ar.length;i++) {
			ar[i]=scanner.nextInt();
		}
		int avg=0;
		for(int i=0;i<ar.length/2;i++) {
			avg+=ar[i];
		}
		System.out.println("The avrage of half of the number is "+avg/(ar.length/2));
		
		
	}

}
